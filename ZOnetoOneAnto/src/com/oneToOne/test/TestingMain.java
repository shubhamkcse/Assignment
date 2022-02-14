package com.oneToOne.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.oneToOne.HibernateUtil;

public class TestingMain {
	
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		//updatePersonTable(sf);
		//deletePersonTable(sf);
		//selectPersonTable(sf);
		insertPersonTable(sf);
	}

	private static void insertPersonTable(SessionFactory sf)
	{
		try(Session session = sf.openSession())
		{
			String hql ="insert into Person(pId,pName,pAddress) value(10,'SSSSS','EEEEE')"+"select pId,pName,pAddress from Person";
			
			Query query = session.createQuery(hql);
			session.beginTransaction();
			int executeUpdate = query.executeUpdate();
			if(executeUpdate>0)
				System.out.println(executeUpdate+" records are inserted successfully..");
			session.getTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

//	private static void selectPersonTable(SessionFactory sf) {
//		// TODO Auto-generated method stub
//		
//		try(Session session = sf.openSession())
//		{
//			String hql="select pId,pName,pAddress from Person";
//			
//			Query query= session.createQuery(hql);
//			
//			session.beginTransaction();
//			int executeUpdate = query.executeUpdate();
//			session.getTransaction().commit();
//			if(executeUpdate>0)
//				System.out.println("Person showing");
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}


	public static void updatePersonTable(SessionFactory sf)
	{
		long personId=14;
		String newAddress="Nashik";
		try(Session session = sf.openSession())
		{
			String hql="update Person set pAddress=:newAddress where pId=:personId";
			
			Query query= session.createQuery(hql);
			query.setParameter("newAddress", newAddress);
			query.setParameter("personId", personId);
			
			session.beginTransaction();
			int executeUpdate = query.executeUpdate();
			session.getTransaction().commit();
			
			/*
			 * Person person = (Person) query.uniqueResult(); session.update(person);
			 */
			
			//System.out.println(person.getpId()+" "+person.getpName()+" "+person.getpAddress());
			
			if(executeUpdate>0)
				System.out.println("Person address is updated");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void deletePersonTable(SessionFactory sf) {
		
		long personId=12;
		try(Session session = sf.openSession())
		{
			String hql="delete from Person where pId=:personId";
			
			Query query= session.createQuery(hql);
			query.setParameter("personId", personId);
			
			session.beginTransaction();
			int executeUpdate = query.executeUpdate();
			session.getTransaction().commit();
			
			//Person person = (Person) query.uniqueResult();
			//session.delete(person);
			
			//System.out.println(person.getpId()+" "+person.getpName()+" "+person.getpAddress());
			
			
			if(executeUpdate>0)
				System.out.println("Person is deleted");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


