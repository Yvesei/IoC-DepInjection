package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData(){
        System.out.println("version base de donnees");
        // connect to DB => get Temperature
        double temp = Math.random()*40;
        return temp;
    }
}
