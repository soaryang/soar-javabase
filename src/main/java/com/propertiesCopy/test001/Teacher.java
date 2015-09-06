package com.propertiesCopy.test001;

public class Teacher {
	private int id;
	private String name;
	private String tno;
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
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", tno=" + tno + "]";
	}
	
	
	
}
