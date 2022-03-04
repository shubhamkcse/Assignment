package com.EmdableDemo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	private static SessionFactory factory; 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         try {
             factory = new Configuration().configure().buildSessionFactory();
          } catch (Throwable ex) { 
             System.err.println("Failed to create sessionFactory object." + ex);
             throw new ExceptionInInitializerError(ex); 
          }
         Session session = factory.openSession();
          Transaction tx = null;
          Long PersonID = null;

         Animal animal=new Animal();
         animal.setFamily("Felish");
         Loin loin = new Loin();
         //Lion loin =new Lion(animal);

          try {
             tx = session.beginTransaction();
             loin.setAnimal(animal);
             loin.setBreed("Lio");
             
             session.save(loin); 
             session.update(loin);

             tx.commit();
          } catch (HibernateException e) {
             if (tx!=null) tx.rollback();
             e.printStackTrace(); 
          } finally {
             session.close(); 
          }
    }
}
