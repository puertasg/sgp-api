package com.example.sgpapi.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sgpapi.entite.Banque;
import com.example.sgpapi.entite.Collaborateur;
import com.example.sgpapi.repository.CollaborateurRepository;

@RestController
@RequestMapping("/api/collaborateurs")
public class CollaborateurController {

	@Autowired
	private CollaborateurRepository collabRepo;

	@GetMapping
	public List<Collaborateur> listerCollaborateurs() {
		System.out.println("lister");
		return collabRepo.findAll();
	}

	@GetMapping(params = "departement")
	public List<Collaborateur> listerCollaborateurDepartement(@RequestParam(value = "departement") Integer id) {
		return collabRepo.findByDepartementId(id);
	}

	@GetMapping("/{matricule}")
	public Collaborateur retournerCollaborateur(@PathVariable(value = "matricule") String matricule) {
		return collabRepo.findByMatricule(matricule);
	}

	@GetMapping("/{matricule}/banque")
	public Banque retournerBanque(@PathVariable(value = "matricule") String matricule) {
		Collaborateur collab = collabRepo.findByMatricule(matricule);
		return collab.getBanque();
	}

	@PutMapping("/{matricule}")
	public void updateCollaborateur(@PathVariable(value = "matricule") String matricule,
			@RequestBody Collaborateur newCollab) {
		Collaborateur oldCollab = collabRepo.findByMatricule(matricule);
		newCollab.setId(oldCollab.getId());

		collabRepo.save(newCollab);
	}

	@PutMapping("/{matricule}/banque")
	public void updateBanque(@PathVariable(value = "matricule") String matricule, @RequestBody Banque banque) {

		Collaborateur collab = collabRepo.findByMatricule(matricule);
		collab.setBanque(banque);

		collabRepo.save(collab);
	}
}
