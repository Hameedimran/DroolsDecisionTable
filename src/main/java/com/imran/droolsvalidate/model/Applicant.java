package com.imran.droolsvalidate.model;

public class Applicant {

	private Integer applicantId;
	private String name;
	private String dob;
	private String gender;
	private boolean validApplicant;
	private String applicantType;
	private Double accountOpenAmt;

	public Applicant() {

	}

	public Applicant(Integer applicantId, String name, String dob, String gender) {
		super();
		this.applicantId = applicantId;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isValidApplicant() {
		return validApplicant;
	}

	public void setValidApplicant(boolean validApplicant) {
		this.validApplicant = validApplicant;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	
	public Double getAccountOpenAmt() {
		return accountOpenAmt;
	}

	public void setAccountOpenAmt(Double accountOpenAmt) {
		this.accountOpenAmt = accountOpenAmt;
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", validApplicant=" + validApplicant + ", applicantType=" + applicantType + ", accountOpenAmt="
				+ accountOpenAmt + "]";
	}

	

}
