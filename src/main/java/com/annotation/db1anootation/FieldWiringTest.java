package com.annotation.db1anootation;

public class FieldWiringTest {
    public static void main(String args[]) throws Exception {
        MyAnnotationBeanProcessor processor = new MyAnnotationBeanProcessor();

        MyService b = new MyService();

        processor.wire(b, new IFieldWiring[] {new DataSourceWiring()});
        
        System.out.println(b.selectForObjectFromB("", null));
        System.out.println(b.selectForObjectFromA("", null));
    }
}
