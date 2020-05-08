package com.example.emp;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface EmpController {
	private static final String template = "Role of the employee is %s";
	private final AtomicLong cntr = new AtomicLong();
	
	@GetMapping("/employees")
	public default Employee employees(@RequestParam(value = "name", defaultValue = "Employee") String name) {
		if(name.equals("abc"))
		{
			return new Employee(cntr.incrementAndGet(), String.format(template, "manager"));
		}
		if(name.equals("pqr"))
		{
			return new Employee(cntr.incrementAndGet(), String.format(template, "director"));
		}
		if(name.equals("xyz"))
		{
			return new Employee(cntr.incrementAndGet(), String.format(template, "intern"));
		}
	}
}
