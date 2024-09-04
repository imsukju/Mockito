package com.Quiz0824test.One;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Quiz0824.One.OrderRepository;
import com.Quiz0824.One.OrderRepositoryimple;
import com.Quiz0824.One.OrderService;
import com.Quiz0824.One.Otherimpl;

@ExtendWith(MockitoExtension.class)
public class Mocktest {
	

	@Mock 
	OrderService oderservice1 = new Otherimpl(new OrderRepositoryimple());
	
	@Test
	public void testmockone()
	{
		String KFC = "Kentucky Fried Chicken";
		oderservice1.placeOrder(KFC);
		
		verify(oderservice1, times(1)).placeOrder(KFC);
		
		
		
	}
	
}
