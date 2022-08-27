package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="EmppTrail")
public class EmpModel {
	@javax.persistence.Id
	@Column(name="Id")
	private int Id;
	@Column(name="Name")
	private String Name;
	@Column(name="Designation")
	private String Designation;
	@Column(name="Salary")
	private int Salary;
	
	public EmpModel() {
		super();
	}
	public EmpModel(int id, String name, String designation, int salary) {
		super();
		Id = id;
		Name = name;
		Designation = designation;
		Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
}
