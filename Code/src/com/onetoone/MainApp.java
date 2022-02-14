package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee("Shubham", "Pune");
		Laptop laptop = new Laptop("intel5", "24GM");
		employee.setLaptop(laptop);
		laptop.setEmployee(employee);
		session.save(laptop);
		session.save(employee);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}