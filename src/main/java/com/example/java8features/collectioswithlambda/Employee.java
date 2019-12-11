package com.example.java8features.collectioswithlambda;

public class Employee {
	int eno;
	String ename;

	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee{" + "eno=" + eno + ", ename='" + ename + '\'' + '}';
	}
	public void setEno(int eno) {
		this.eno = eno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEno() {
		return eno;
	}

	public String getEname() {
		return ename;
	}

}
