package com.kyc.emp;

import javax.persistence.*;

@Entity
public class Formers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fId;
    
    @Column(name = "Former_name")
    private String fname;
    
    private String state;
    private String city;
    private String village;
    
    @Column(name = "Year_Income")
    private double income;

    
    @Override
    public String toString() {
        return "Formers [fId=" + fId + ", fname=" + fname + ", state=" + state + ", city=" + city + ", village=" + village
                + ", income=" + income + "]";
    }

 // Getters and setters here...

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
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

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
}
