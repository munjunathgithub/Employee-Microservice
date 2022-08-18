package com.emp.Entity;

public class Record { 
	
	private Long cId;
	private String email;
	private String companyname;
	private Long eId;
	
	public Record(Long cId, String email, String companyname, Long eId) {
		super();
		this.cId = cId;
		this.email = email;
		this.companyname = companyname;
		this.eId = eId;
	}
	
	public Record() {
		super();
	}

   public Long getcId() {
	   return cId;
   }
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	
	
	

}
