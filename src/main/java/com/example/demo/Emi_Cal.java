package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emi_Cal {
	
	@Id
	private double loan_amount;
	
    private double Emi;
    
    private double month;
    
    private double intrest;

	    public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getEmi() {
		return Emi;
	}
	public void setEmi(double emi) {
		Emi = emi;
	}
	public double getMonth() {
		return month;
	}
	public void setMonth(double month) {
		this.month = month;
	}
	public double getIntrest() {
		return intrest;
	}
	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
		
}
