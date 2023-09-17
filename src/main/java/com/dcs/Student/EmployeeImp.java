package com.dcs.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeImp {

    @Id
    @GeneratedValue
    private int id; // Corrected variable name to 'id'
    private String name;
    private String department; // Corrected variable name to 'department'
    private double salary;

    // Getters and setters here...

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 @Override
	    public String toString() {
	        return "EmployeeImp [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	    }
}
