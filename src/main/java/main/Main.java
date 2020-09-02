package main;

import DAO.ModelDAOImpl;
import models.Book;
import models.User;

public class Main {
    public static void main(String [] args){
        Book book = new Book("Metro2033");
        Book book2 = new Book("Metro2034");
        Book book3 = new Book("Metro2035");

        ModelDAOImpl dao = new ModelDAOImpl();
        User user = new User("Egor");
        User user1 = new User("Egor1");
        User user2 = new User("Egor2");
        user.setBook(book);
        user1.setBook(book2);
        user2.setBook(book3);
        dao.addModel(book);
        dao.addModel(book2);
        dao.addModel(book3);
        dao.addModel(user);
        dao.addModel(user1);
        dao.addModel(user2);

    }
}
