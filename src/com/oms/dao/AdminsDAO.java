package com.oms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.oms.entity.Admins;

public class AdminsDAO extends JpaDAO<Admins> implements GenericDAO<Admins> {

	public AdminsDAO() {
	}

	public Admins create(Admins user) {
		return super.create(user);
	}
	@Override
	public Admins update(Admins user) {
		return super.update(user);
	}

	@Override
	public Admins get(Object userId) {
		return super.find(Admins.class, userId);
	}

	public Admins findByEmail(String email) {
		List<Admins> listUsers =super.findWithNamedQuery("Users.findByEmail", "email", email);
		
		if(listUsers != null && listUsers.size()==1) {
			return listUsers.get(0);
		}
		
		return null;
	}
	
	public boolean checkLogin(String email, String password) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("email", email);
		parameters.put("password", password);
		
		List<Admins> listUsers = super.findWithNamedQuery("Users.checkLogin", parameters);
		
		if(listUsers.size()==1) {
			return true;
		}
		return false;
	}
	
	@Override
	public void delete(Object userId) {
		super.delete(Admins.class,userId);
	}

	@Override
	public List<Admins> listAll() {
		return super.findWithNamedQuery("Users.findAll");
	}

	@Override
	public long count() {
		return super.countWithNamedQuery("Users.countAll");
	}

}
