package com.example.sgpapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sgpapi.entite.Collaborateur;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {

	Collaborateur findByMatricule(String matricule);

	List<Collaborateur> findByDepartementId(int id);
}
