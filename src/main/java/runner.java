import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class runner {
    public static void main(String []args){


//        Man man = new Man();
//        man.setName("aliazlimi");
////        man.setSsn(1);
//
//        Man man2 = new Man();
//        man2.setName("mahmoodkazemi");
////        man.setSsn(1);
//
//        Man man3 = new Man();
//        man3.setName("javasdshirin");





        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
//
//        session.save(man);
//        session.save(man2);
//        session.save(man3);


//
////        man.setName("jj");
////        man.setSsn(2);
//
//        Man x = session.get(man.getClass() , 1);
//        session.delete(man);
//
//        x.setSsn(22);
//        session.save(x);
//

//
//        Query quesy = session.createQuery("from Man where ssn = :soosan ");
        Query quesy = session.getNamedQuery("getAllUsers");
        quesy.setString("soosa" , "aliazlimi");
//        quesy.setString("nname","aliazimi");
        List list = quesy.list();

        session.getTransaction().commit();
        session.close();

        Man test = (Man) list.get(0);

//        for ( Man a:list)
            System.out.println(test.getSsn());
//        System.out.println( (list.get(0));


    }
}
