package com.etoak.factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	private static Map<String , ForFactoryInterface> map = new HashMap<String,ForFactoryInterface>();
	
	public static void setFactory(String str , ForFactoryInterface fac){
		map.put(str, fac); 
	}
	
	public static ForFactoryInterface getFactory(String str){
		return map.get(str);
	}
}
