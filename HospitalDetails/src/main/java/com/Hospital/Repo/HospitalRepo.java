package com.Hospital.Repo;

import org.springframework.data.repository.CrudRepository;

import com.Hospital.entites.HospitalDetail;

public interface HospitalRepo extends CrudRepository<HospitalDetail, Integer>{

}
