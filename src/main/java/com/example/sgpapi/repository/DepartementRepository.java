package com.example.sgpapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sgpapi.entite.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
