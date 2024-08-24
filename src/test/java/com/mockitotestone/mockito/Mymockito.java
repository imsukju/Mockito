package com.mockitotestone.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mockitoone.Domain.Level;
import com.mockitoone.Domain.User;
import com.mockitoone.dao.MyConfigs;
import com.mockitoone.dao.UserDao;
import com.mockitoone.dao.UserDaoJdbc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static com.mockitoone.service.UserServiceImpl.MIN_LOGCOUNT_FOR_SILVER;
import static com.mockitoone.service.UserServiceImpl.MIN_RECCOMEND_FOR_GOLD;
import java.util.Arrays;
import java.util.List;


import static java.lang.System.out;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MyConfigs.class})
public class Mymockito {
	
	@Autowired
	@Qualifier("userDao") UserDao userdao;
	
	@Mock
	private UserDao mockdao1 = userdao;
	UserDao mockdao2 = Mockito.mock(UserDaoJdbc.class);
	
	
	List<User> users;	// test fixture
	@BeforeEach
	public void setUp() {	
		
		users = Arrays.asList(
				new User("bumjin", "�ڹ���", "p1", "user1@ksug.org", Level.BASIC, MIN_LOGCOUNT_FOR_SILVER-1, 0),
				new User("joytouch", "����", "p2", "user2@ksug.org", Level.BASIC, MIN_LOGCOUNT_FOR_SILVER, 0),
				new User("erwins", "�Ž���", "p3", "user3@ksug.org", Level.SILVER, 60, MIN_RECCOMEND_FOR_GOLD-1),
				new User("madnite1", "�̻�ȣ", "p4", "user4@ksug.org", Level.SILVER, 60, MIN_RECCOMEND_FOR_GOLD),
				new User("green", "���α�", "p5", "user5@ksug.org", Level.GOLD, 100, Integer.MAX_VALUE)
				);
	}	
	@Test
	public void setmock()
	{
		 MockitoAnnotations.openMocks(this);
		 
		 mockdao1.add(users.get(0));
		 verify(mockdao1,times(1)).add(users.get(1));
		 
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}

}
