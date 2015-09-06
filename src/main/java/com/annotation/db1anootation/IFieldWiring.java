package com.annotation.db1anootation;

import java.lang.reflect.Field;

//http://blog.chinaunix.net/uid-532511-id-3049720.html
public interface IFieldWiring {

	Class annotationClass();
    
    void wiring(Object object, Field field);
}
