package com.springcores;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student 
{
	@Bean
   public Student getStudent() 
   {//create a new object
	   Student student=new Student();
	   return student;
   }
}
