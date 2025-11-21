package com.mphasis.DayOne;

public class Employee {

	private int empId;
	private String empName;
	private String desg;
	private String mobile_number;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", desg=" + desg + ", mobile_number="
				+ mobile_number + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getDesg()="
				+ getDesg() + ", getMobile_number()=" + getMobile_number() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
