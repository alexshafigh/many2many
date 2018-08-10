import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class runner {
    public static void main(String []args){

        Man aliazimi = new Man();
        aliazimi.setName("aliazimi");

        Man mahmoodkazemi = new Man();
        mahmoodkazemi.setName("mahmoodkazemi");

        Vehicle H30 = new Vehicle();
        H30.setName("H30");
        H30.setNumber(111111);

        Vehicle persia = new Vehicle();
        persia.setName("persia");
        persia.setNumber(222222);

        aliazimi.getVehicles().add(H30);
        aliazimi.getVehicles().add(persia);
        mahmoodkazemi.getVehicles().add(persia);

        H30.getOwners().add(aliazimi);
        H30.getOwners().add(mahmoodkazemi);


        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.save(aliazimi);
        session.save(mahmoodkazemi);
        session.save(H30);
        session.save(persia);
        session.beginTransaction().commit();
        session.close();




    }
}
