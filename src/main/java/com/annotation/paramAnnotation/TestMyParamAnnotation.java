package com.annotation.paramAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMyParamAnnotation {
	public void test1(@MyParamAnnotation(id = 0, age = 0) String a,@MyParamAnnotation(id = 0, age = 0) String b) {

	}

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] m = TestMyParamAnnotation.class.getDeclaredMethods();
		for (Method method : m) {
			//获取方法中参数个数
			Annotation[][] an = method.getParameterAnnotations();
			System.out.println("method-------->"+method.getName()+"------length------------------>"+an.length);
			for (int i = 0; i < an.length; i++) {
				System.out.println("a[i]-------------->"+an[i].length);
				for (int j = 0; j < an[i].length; j++) {
					MyParamAnnotation t = (MyParamAnnotation) an[i][j];
					System.out.println(method.getName() + "," + t.age() + "," + t.id() + "," + t.name());
				}
			}

		}
	}
}
