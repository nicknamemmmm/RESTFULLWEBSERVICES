package com.soft;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App2 {

	
	
	public static void main(String[] args) {
		try {
			String json = "{\"id\":101,\"name\":\"Aarti\",\"salary\":20303.0}";
			
			ObjectMapper om = new ObjectMapper();
			
			Employee emp = om.readValue(json,Employee.class);
			
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
