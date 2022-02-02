package com.example.demo.models;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@SequenceGenerator(
			name="employee_sequence",
			sequenceName = "employee_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "employee_sequence" 
	)
	
	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	private int deptId;
	@Transient
	private int age;
	
	public Employee() {
		
	}

	public Employee(String name, String email, LocalDate dob, int deptId) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.deptId = deptId;
	}



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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getAge() {
		return Period.between(this.dob, LocalDate.now()).getYears();
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", dob=" + dob + 
				", age=" + age + 
				", deptId=" + deptId +
				'}';
	}
}
