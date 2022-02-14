package com.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainEmployee {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Laptop laptop=new Laptop("process","500gm","2gm");
		Person person1 = new Person("shubham","Pune");
		Person person2 = new Person("Dinesh","Mumbai");
		Person person3 = new Person("Saggy","Goa");
		Employee employee=new Employee("ITDept");
		employee.setLaptop(laptop);
		employee.setPerson(person1);
		employee.setPerson(person2);
		employee.setPerson(person3);
		session.save(laptop);
		session.save(person1);
		session.save(person2);
		session.save(person3);
		session.save(employee);
		//session.delete(person); use for delete the person data;
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}