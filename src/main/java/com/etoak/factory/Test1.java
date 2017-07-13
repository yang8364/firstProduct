package com.etoak.factory;

import org.springframework.stereotype.Component;

/*@Service("test1")*/
@Component
public class Test1 implements ForFactoryInterface {

	public Test1(){
		Factory.setFactory("test1", this);
	}
	
	@Override
	public String getSign() {
		return "test1 执行了";
	}

}
