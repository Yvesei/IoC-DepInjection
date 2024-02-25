package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    // couplage faible:
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*640/Math.cos(temp*Math.PI);
        return res;
    }
    // inject in the Var dao an Object of a class that inplements the interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
