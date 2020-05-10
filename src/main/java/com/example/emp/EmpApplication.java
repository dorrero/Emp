package com.example.emp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpApplication {

	public static void main(String[] args) throws IOException, ParseException {
				
		JSONParser parser = new JSONParser();
		
		FileReader reader = new FileReader("/home/sunny/Mastercard/emp/src/main/resources/EmployeeData.json");
		
		Object obj = parser.parse(reader);
		JSONObject empjsonobj = (JSONObject)obj;
		
		SpringApplication.run(EmpApplication.class, args);
	}
}
