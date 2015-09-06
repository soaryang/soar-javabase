package com.propertiesCopy.test001;

public class Student {
	private int id;
	private String name;
	private String sno;
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
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sno=" + sno + "]";
	}
	
}
