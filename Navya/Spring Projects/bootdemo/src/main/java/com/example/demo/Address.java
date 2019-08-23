package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("adr")
public class Address {
	@Value("Telangana")
	private String state;
	@Value("Hyderabad")
	private String city;
	@Value("500011")
	private int pin;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", pin=" + pin + ", city=" + city + "]";
	}
	
}
