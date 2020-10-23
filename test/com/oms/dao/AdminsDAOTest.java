package com.oms.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.oms.entity.Admins;

class AdminsDAOTest {

	@Test
	void testCreateAdmins() {
		Admins admin1=new Admins();
		admin1.setName("ankur");
		admin1.setEmail("a@a");
		admin1.setPassword("a");
	    
		AdminsDAO adminsDAO=new AdminsDAO();
		admin1 =adminsDAO.create(admin1);
		
		assertTrue(admin1.getId()>0);
		/*
		 * EntityManagerFactory
		 * entityManagerFactory=Persistence.createEntityManagerFactory(
		 * "OrderManagementProject"); EntityManager
		 * entityManager=entityManagerFactory.createEntityManager();
		 * 
		 * entityManager.getTransaction().begin();
		 * 
		 * entityManager.persist(admin1);
		 * 
		 * entityManager.getTransaction().commit();
		 * 
		 * entityManager.close(); entityManagerFactory.close();
		 */
	}

}
