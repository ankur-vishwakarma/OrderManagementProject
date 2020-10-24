package com.oms.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oms.entity.Items;

public class ItemsDAOTest {

	public static ItemsDAO itemsDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		itemsDAO=new ItemsDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		itemsDAO.close();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testListAll() {
		List<Items> listGames = itemsDAO.listAll();
		
		for( Items i : listGames) {
			System.out.println(i.getId() + " "+ i.getName() +" "+i.getPrice());
		}
		
		assertFalse(listGames.isEmpty());
	}

}
