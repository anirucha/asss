package com.cg.bean;

public class Employee {
	private int id;
	private String name;
	private long mobile;
	private double salary;


	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, long mobile, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.salary = salary;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile
				+ ", salary=" + salary + "]";
	}

}
