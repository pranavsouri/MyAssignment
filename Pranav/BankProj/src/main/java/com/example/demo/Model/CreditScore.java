/**
 * 
 */
package com.example.demo.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Abridge
 *
 */
@Entity
public class CreditScore {

	@Id
	String email;
	String name;
	Date dob;	
	int creditscore;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	@Override
	public String toString() {
		return "CreditScore [email=" + email + ", name=" + name + ", dob=" + dob + ", creditscore=" + creditscore + "]";
	}
	
	

}
