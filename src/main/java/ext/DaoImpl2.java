package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version capteurs !");
        double temp = 700;
        return temp ;
    }
}
