package com.springcores;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext("TestConfig.class");
        Student student1=context.getBean("firstStudent",Student.class);
        System.out.println(student1);
    
    }
}
