package com.propertiesCopy.test001;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class TestMain {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Student student = new Student();
		student.setId(1);
		student.setName("soar");
		student.setSno("22222");
		
		Teacher teacher = new Teacher();
		BeanUtils.copyProperties(teacher, student);
		
		System.out.println(teacher);
		
	}
}
