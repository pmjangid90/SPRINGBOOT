package com.Hospital.entites;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOSPITAL_DETAIL")
public class HospitalDetail {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPT_ID")                           // this is primary key for HOSPITAL_DETAIL table.
	private Integer DepartmentID;
	
	@Column(name="DEPT_NAME")
	private String DepartmentName;
	
	@Column(name = "DR_NAME")
	private String DoctorName;
	
	@Column(name = "EXP")
	private Integer Experience;
	
	@Column(name = "DR_PROFILE")
	private String DoctorProfile;
	
	/* Here is getter and setter method for these above properties for the Hospital Data*/

	public Integer getDepartmentID() {
		return DepartmentID;
	}

	public void setDepartmentID(Integer departmentID) {
		DepartmentID = departmentID;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	public Integer getExperience() {
		return Experience;
	}

	public void setExperience(Integer experience) {
		Experience = experience;
	}

	public String getDoctorProfile() {
		return DoctorProfile;
	}

	public void setDoctorProfile(String doctorProfile) {
		DoctorProfile = doctorProfile;
	}

	@Override
	public String toString() {
		return "HospitalDetail [DepartmentID=" + DepartmentID + ", DepartmentName=" + DepartmentName + ", DoctorName="
				+ DoctorName + ", Experience=" + Experience + ", DoctorProfile=" + DoctorProfile + "]";
	}
	

	
	
	
	
	

}
