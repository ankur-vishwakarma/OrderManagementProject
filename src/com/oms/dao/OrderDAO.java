package com.oms.dao;

import java.util.Date;
import java.util.List;

import com.oms.entity.Orders;

public class OrderDAO extends JpaDAO<Orders> implements GenericDAO<Orders> {

	@Override
	public Orders create(Orders order) {
		order.setDate(new Date());
		order.setStatus("Processing");
		return super.create(order);
	}
	
	@Override
	public Orders get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Orders> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
