package com.example.springbooteg.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbooteg.dao.patientdao;
import com.example.springbooteg.dto.Patientdata;

@RestController
@RequestMapping("/patients")
public class Patientcontroller {

	@Autowired
	patientdao dao;

	@PostMapping
	public void insert(@RequestBody Patientdata dto) {
		dao.insert(dto);
		System.out.println(dto);
	}

	@GetMapping("/fetchbyid")
	public Patientdata fetchPatientById(@RequestParam int id) {
		//int id=dto.getId();
		return dao.fetchPatientById(id);
	}
	
	@GetMapping
	public List<Patientdata> fetchAll(){
		return dao.fetchAll();
	}
	
	@DeleteMapping("/deletebyid")
	public String deletePatientById(@RequestParam int id) {
		return dao.deletePatientById(id);
	}
	
	@PutMapping
	public String updatePatient(@RequestBody Patientdata dto) {
	return dao.updatePatient(dto);
	}


}
