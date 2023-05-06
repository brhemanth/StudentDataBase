package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
private int sid;
private String sname;
private String email;
private int phno;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phno=" + phno + "]";
}

}
