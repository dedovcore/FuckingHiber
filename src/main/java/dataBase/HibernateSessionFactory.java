package dataBase;

import models.Book;
import models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactory {
    private static SessionFactory instance;
    private HibernateSessionFactory(){}
    public static SessionFactory getInstance(){
        if(instance == null){
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Book.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            instance = configuration.buildSessionFactory(builder.build());
        }
        return instance;
    }
}
