package com.example.springbooteg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.springbooteg.dto.Patientdata;
@Component
public interface Patientrepo extends JpaRepository<Patientdata, Integer>
{

}
