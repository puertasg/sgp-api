package dev.sgp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.sgp.entite.Collaborateur;
import dev.sgp.repository.CollaborateurRepository;

@RestController
@RequestMapping("/api/collaborateurs")
public class CollaborateurController {

	@Autowired
	private CollaborateurRepository collabRepo;

	@GetMapping
	public List<Collaborateur> listerCollaborateurs() {
		return collabRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "?departement={idDepartement}")
	public List<Collaborateur> listerCollaborateurDepartement(@RequestParam(value = "idDepartement") int id) {
		return collabRepo.findByDepartementId(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{matricule}")
	public Collaborateur retournerCollaborateur(@PathVariable(value = "matricule") String matricule) {
		return collabRepo.findByMatricule(matricule);
	}
}
