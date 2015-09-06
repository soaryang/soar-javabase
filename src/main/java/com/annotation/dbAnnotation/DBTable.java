package com.annotation.dbAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//类，接口或enum
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}
