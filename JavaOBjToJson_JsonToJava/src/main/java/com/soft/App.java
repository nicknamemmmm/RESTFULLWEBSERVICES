package com.soft;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
       
    	Employee emp = new Employee();
    	emp.setId(101);
    	emp.setName("Aarti");
    	emp.setSalary(20303);
    	ObjectMapper om = new ObjectMapper();
    	
    	String json = om.writeValueAsString(emp);
    	System.out.println(json);
    }
}
