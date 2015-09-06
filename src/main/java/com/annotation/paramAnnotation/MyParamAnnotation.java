package com.annotation.paramAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyParamAnnotation {
	public int id() default 0;  
    public String name() default "lidong";  
    public int age() default 0;
}
