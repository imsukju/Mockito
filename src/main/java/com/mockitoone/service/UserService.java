package com.mockitoone.service;

import com.mockitoone.Domain.User;

public interface UserService {
	void add(User user);
	void upgradeLevels();
}