package com.Hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.Repo.HospitalRepo;
import com.Hospital.entites.HospitalDetail;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepo hospitalRepo;
	
	public void saveHospitalDetail() {
		
		HospitalDetail h_detail = new HospitalDetail();
		
		h_detail.setDepartmentName("CARDIOLOGY");
		h_detail.setDoctorName("DR. VINEET");
		h_detail.setDoctorProfile("CONSULTANT");
		h_detail.setExperience(8);
		
		hospitalRepo.save(h_detail);
					
	}
	
	

}
