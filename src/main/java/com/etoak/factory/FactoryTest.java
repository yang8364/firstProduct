package com.etoak.factory;

public class FactoryTest {
	
	
	public static void main(String[] args) {
		new Test1();
		new Test2();
		ForFactoryInterface tf = Factory.getFactory("test2");
		System.out.println(tf.getSign());
		
//		 String aa = Base64.getEncoder().encode(new Bety[]);
		
	}
	

}
