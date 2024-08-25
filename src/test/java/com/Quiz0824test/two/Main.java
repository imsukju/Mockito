package com.Quiz0824test.two;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassLoader classLoader = Main.class.getClassLoader();
		 PaymentService payser = new PaymentServiceImpl();
		 
		 PaymentService proxy1 = (PaymentService) Proxy.newProxyInstance(
	                classLoader,
	                new Class<?>[]{PaymentService.class},
	                new PaymentInvocation(payser)
	        );
		  
		 proxy1.processPayment("Hello", 0);
	}

}
