package com.serializable.test001;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestMain {
	
	@Test
	public void output(){
		List<UserBean> list = new ArrayList<UserBean>();
		for(int i=0; i<5; i++){
			UserBean userBean = new UserBean();
			list.add(userBean);
		}
		
		
		System.out.println(list);
	}
}
