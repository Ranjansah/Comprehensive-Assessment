package com.test.doctor.Doctors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ComprehensiveAssessment")
public class Doctor  implements Comparable<Doctor> {
	
	private int id;
	private String name;
	private int salary;
	private String specialist;
	
	
	public Doctor()
	{
		
	}
	
	
	public Doctor(int id, String name, int salary, String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.specialist = specialist;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getSpecialist() {
		return specialist;
	}


	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	public int compareTo(Doctor obj) {
	
		if(this.salary != obj.salary)
		{
			if(this.salary > obj.salary)
			  return -1;
			else 
			  return 1;
		}
		else
		{
		  return this.name.compareTo(obj.name);
		}
	}
	

}
