package com.annotation.db1anootation;

import java.lang.reflect.Field;

public class MyAnnotationBeanProcessor {
	
    public void wire(Object serviceObject, IFieldWiring[] fieldAutoWirings) throws Exception {
        Class cls = serviceObject.getClass();
        for (Field field : cls.getDeclaredFields()) {
            for (IFieldWiring fieldAutoWiring : fieldAutoWirings) {
                if (field.isAnnotationPresent(fieldAutoWiring.annotationClass())) {
                    fieldAutoWiring.wiring(serviceObject, field);
                    break;
                }
            }
        }
    }
}
