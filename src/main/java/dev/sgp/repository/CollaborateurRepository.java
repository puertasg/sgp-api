package dev.sgp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgp.entite.Collaborateur;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {

	Collaborateur findByMatricule(String matricule);
	List<Collaborateur> findByDepartementId(int id);
}
