package com.oms.dao;

import java.util.List;

import com.oms.entity.Items;

public class ItemsDAO extends JpaDAO<Items> implements GenericDAO<Items> {

	@Override
	public Items get(Object id) {
		return super.find(Items.class, id);
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Items> listAll() {
		return super.findWithNamedQuery("Items.findAll");
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
