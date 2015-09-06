package com.annotation.methodannotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMethodAnnotation {
	public static void main(String[] args) {
		 List<Integer> useCases = new ArrayList<Integer>();
	     Collections.addAll(useCases, 47, 4, 49, 50);
	     trackUseCases(useCases, PasswordUtils.class);
	}
	
	public static void trackUseCases(List<Integer> list, Class<?> cls){
		Method[] methods = cls.getDeclaredMethods();
		for(Method method:methods){
			MyMethodAnnotation myMethodAnnotation = method.getAnnotation(MyMethodAnnotation.class);
			if(myMethodAnnotation!=null){
				System.out.println(myMethodAnnotation.id() +"--------"+myMethodAnnotation.description());
				list.remove(new Integer(myMethodAnnotation.id()));
			}
		}
		
		for(int i=0; i<list.size();  i++){
			System.out.println(list.get(i));
		}
		
	}
}
