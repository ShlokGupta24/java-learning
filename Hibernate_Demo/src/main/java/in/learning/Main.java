package in.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //Setting the value of first object
//        Alien a1=new Alien();
//        a1.setId(103);
//        a1.setName("Krishna");
//        a1.setTech("Typescript");
//
//        //Now we want Hibernate ORM add or save these details in DB
//
//        //So configuration is a class so we can create its object, which help Hibernate to configure to the DB in which operation will perform.
//        Configuration config=new Configuration();
//        config.addAnnotatedClass(in.learning.Alien.class); //Adding annotated class so that hibernate knows in which class he ahs to work and also use @Entity annoatation in the class also, so specify.
//        config.configure();
//        //To maintain those sessions we create SessionFactory, which looks and provides working to the sessions.
//        SessionFactory factory=config.buildSessionFactory();
//
//        //Instead of all 4 above lines of code, we can all do it in one single line like below, we don't need to create obj of Configuration and perform these operation.
//        SessionFactory factory=new Configuration()
//                                .addAnnotatedClass(in.learning.Alien.class)
//                                .configure()
//                                .buildSessionFactory();
//        //We need a session in Hibernate to perform an operation like saving, deleting, adding or updating.
//        Session session=factory.openSession();
//        //We need Transaction to commit the changes or task perform that we have done using hibernate, in this case, is adding a1 data to DB.
//        Transaction transaction= session.beginTransaction();
//
//        //We have hibernate.cfg.xml file in resources folder to connect hibernate with the DB to perform operation in DB.
//        session.persist(a1); //Adding or persisting a1 to save on DB
//        transaction.commit();//Commit the save on DB using transaction. It is very imp to commit after all the update.
//
//        session.close();
//        factory.close();
//        //All the above code is all about storing the data in the Database using the object Alien in this case and Hibernate.


        //Above all for adding the data to DB
        //Now we are going to fetch the data from Database for tha code will be below, some will just get copied.
//        SessionFactory factory=new Configuration()
//                                .addAnnotatedClass(in.learning.Alien.class)
//                                .configure()
//                                .buildSessionFactory();
//        Session session=factory.openSession();
//        //Alien a1=session.find(Alien.class,103);
//        // Find method is used to find the data using primary key and fetch it from DB and its also passing the query even if we do not do anything with object like printing, so its EagerFetching
//        //There are multiple ways of fetching the data like this also
//        Alien a1=session.getReference(Alien.class,103);
//        //Not passing when we were not printing, this LazyFetching
//        System.out.println(a1);
//        session.close();
//        factory.close();

        //Now we are going to update and delete the data
        Alien a1=new Alien();
        a1.setId(103); //Updating the data at 102
        a1.setName("Gopal");
        a1.setTech("Typescript");
//        a1.setId(104); //Now we have no data at 104, so its should insert data automatically in this position.
//        a1.setName("Avni");
//        a1.setTech("Database");

        SessionFactory factory=new Configuration()
                                .addAnnotatedClass(in.learning.Alien.class)
                                .configure()
                                .buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction= session.beginTransaction();

      // session.merge(a1); //Merge method is used to update and merge the primary key to other or replace from previous to new.
            session.persist(a1);
//        //Now deleting the data from DB
//        Alien a1=session.find(Alien.class,103);
//        session.remove(a1);
        transaction.commit();

        session.close();
        factory.close();
    }
}