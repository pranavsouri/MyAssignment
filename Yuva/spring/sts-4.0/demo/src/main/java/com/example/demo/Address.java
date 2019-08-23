package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addr")
public class Address {
	@Value("HYD")
	private String state;
	@Value("HI-Tech")
	private String city;
	@Value("768987")
	private int pin;
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	/**
	 * @param stae
	 * @param city
	 * @param pin
	 */
	/*
	 * public Address(String stae, String city, int pin) { super(); this.state =
	 * state; this.city = city; this.pin = pin; }
	 */
}
