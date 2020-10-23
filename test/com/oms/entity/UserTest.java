package com.oms.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserTest {
	public static void main(String args[]) {
		User user1=new User();
		user1.setName("ankur");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("OrderManagementProject");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A user was persisited");
		
	}
}
