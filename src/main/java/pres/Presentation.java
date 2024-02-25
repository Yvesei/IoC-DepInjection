package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        // dep inj using instantiation static => new
        MetierImpl metier = new MetierImpl();
        // (1) dependency injection using setters :
        // we can inject whatever impl we want
        DaoImpl dao = new DaoImpl();
//        DaoImpl2 dao = new DaoImpl2();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
