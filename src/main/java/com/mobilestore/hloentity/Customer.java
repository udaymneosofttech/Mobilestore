package com.mobilestore.hloentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
	@Id
	@Column(name="id",length=5,nullable=false)
	private int cid;
	@Column(name="firstname",length=15,nullable=false)
	private String fname;
	@Column(name="lname",length=15,nullable=true)
	private String lname;
	@Column(name="email",length=25,nullable=false,unique=true)
	private String email;
	@Column(name="mobileno",length=12,nullable=false,unique=true)
	private Long mobileno;
	@Column(name="gender",length=10)
	private String gender;
	@Column(name="email",length=25,nullable=false)
	private String password;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMmobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mmobileno="
				+ mobileno + ", gender=" + gender + ", password=" + password + "]";
	}
	

}
