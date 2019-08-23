package com.example.demo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("myresources.properties")
public class Employee {
	@Value("${myname.user}")
	private String name;
	private int age;
	private float salary;
	private String desgination;
	@Autowired
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		System.out.println(address);
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", desgination=" + desgination + "]";
	}
	
	
}
