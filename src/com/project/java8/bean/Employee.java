package com.project.java8.bean;

public class Employee {

	private String eName;
	private int eId;
	private String dept;
	
	
	public Employee(String ename, int eid,String dept) {
		this.eName = ename;
		this.eId = eid;
		this.dept=dept;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"eName='" + eName + '\'' +
				", eId=" + eId +
				", dept='" + dept + '\'' +
				'}';
	}
}
