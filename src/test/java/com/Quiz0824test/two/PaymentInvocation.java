package com.Quiz0824test.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

import static java.lang.System.out;

public class PaymentInvocation implements InvocationHandler{
	private final Object objA;
	
    public PaymentInvocation(Object objA) {
        this.objA = objA;
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
        System.out.println("Before method: " + method.getName());
        
		out.format("\n methos name : %s", method.getName());
 		for(Object a : args)
		{
     			out.format("\n 인자값: %s", a.toString());
		}
		
        Object result = method.invoke(objA, args);
        
        System.out.println("After method: " + method.getName());
        
        return result;
	}

}
