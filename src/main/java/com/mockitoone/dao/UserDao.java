package com.mockitoone.dao;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import com.mockitoone.Domain.User;





public interface UserDao {
	
	void add(User user);

	Optional<User> get(String id);

	List<User> getAll();

	void deleteAll();

	int getCount();

	void update(User user);
	

	DataSource getdatasource();


}