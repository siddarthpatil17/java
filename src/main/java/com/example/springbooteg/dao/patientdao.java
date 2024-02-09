package com.example.springbooteg.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springbooteg.dto.Patientdata;
import com.example.springbooteg.repository.Patientrepo;

@Component
public class patientdao {
	@Autowired
	Patientrepo p;

	public void insert(Patientdata dto) {
		p.save(dto);
	}
	public Patientdata fetchPatientById(int id) {
		Optional<Patientdata> od = p.findById(id);
		// return od.get();
		if (od.isPresent()) {
			Patientdata dto = od.get();
			return dto;
		} else
			return null;
	}
	public List<Patientdata> fetchAll() {
		List<Patientdata> lp = p.findAll();
		if (lp.isEmpty()) {
			return null;
		} else
			return lp;
	}

	public String updatePatient(Patientdata dto) {
		p.save(dto);
		return "updated successfully";
	}

	public String deletePatientById(int id) {
         p.deleteById(id);
         return "data deleted successfully";
	}

	public String deleteAll() {
		p.deleteAll();
		return "all data deleted";
	}


}
