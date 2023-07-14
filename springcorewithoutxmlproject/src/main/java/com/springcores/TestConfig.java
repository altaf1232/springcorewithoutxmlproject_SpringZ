package com.springcores;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.springcores")
public class TestConfig 
{
  public void study() 
  {
	  System.out.println("hello i am working");
  }
}
