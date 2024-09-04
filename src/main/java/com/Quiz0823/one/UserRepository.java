package com.Quiz0823.one;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Quiz0823.one.domain.User;


@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	
	User getUserById(Long ID);

}