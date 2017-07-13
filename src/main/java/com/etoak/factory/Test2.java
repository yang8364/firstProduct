package com.etoak.factory;

import org.springframework.stereotype.Component;

/*@Service("test2")*/
@Component
public class Test2 implements ForFactoryInterface {

	public Test2(){
		Factory.setFactory("test2", this);
	}
	
	@Override
	public String getSign() {
		
		return "test2 执行了";
	}

}
