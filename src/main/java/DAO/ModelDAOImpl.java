package DAO;

import dataBase.HibernateSessionFactory;
import models.Model;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;

public class ModelDAOImpl implements ModelDAO {
    @Override
    public boolean addModel(Model model) {
        Session session = HibernateSessionFactory.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(model);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Model getModel(String name) {
        Session session = HibernateSessionFactory.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from User where name = :name");
        query.setParameter("name", name);
        User user = (User) query.getSingleResult();
        transaction.commit();
        session.close();
        return user;
    }
}
