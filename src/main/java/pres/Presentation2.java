package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        File file = new File("config.txt");
        Scanner sc = new Scanner(file);
        String daoClassName= sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao", IDao.class);
        // metier.setDao(dao)
        method.invoke(metier,dao);

        System.out.println("result => " + metier.calcul());
    }

}
