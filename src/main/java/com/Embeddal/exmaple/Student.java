package com.Embeddal.exmaple;

import javax.persistence.*;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;

	@Embedded
	private Certificate certificate;

	public Student() {
		super();
	}

	public Student(String name, String city, Certificate certificate) {
		super();
		this.name = name;
		this.city = city;
		this.certificate = certificate;
	}

	// getters and setters for name, city, and certificate
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

}
