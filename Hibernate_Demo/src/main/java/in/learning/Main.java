package in.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Setting the value of first object
        Alien a1=new Alien();
        a1.setId(101);
        a1.setName("Shlok");
        a1.setTech("Java");

        //Now we want Hibernate ORM add or save these details in DB

        //So configuration is a class so we can create its object, which help Hibernate to configure to the DB in which operation will perform.
        Configuration config=new Configuration();
        config.addAnnotatedClass(in.learning.Alien.class); //Adding annotated class so that hibernate knows in which class he ahs to work and also use @Entity annoatation in the class also, so specify.
        config.configure();
        //To maintain those sessions we create SessionFactory, which looks and provides working to the sessions.
        SessionFactory factory=config.buildSessionFactory();
        //We need a session in Hibernate to perform an operation like saving, deleting, adding or updating.
        Session session=factory.openSession();
        //We have hibernate.cfg.xml file in resources folder to connect hibernate with the DB to perform operation in DB.
        session.persist(a1);
    }
}