package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {
	@Id
	@SequenceGenerator(
			name="department_sequence",
			sequenceName="department_sequence",
			allocationSize=1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "department_sequence"
	)
	
	private int id;
	private String name;
	private String manager;
	
	public Department() {
		
	}

	public Department(String name, String manager) {
		this.name = name;
		this.manager = manager;
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

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	
	@Override
	public String toString() {
		return "Department{" +
				"id=" + id +
				", name='" + name + '\'' +
				", manager='" + manager + '\'' +
				'}';
	}
}
