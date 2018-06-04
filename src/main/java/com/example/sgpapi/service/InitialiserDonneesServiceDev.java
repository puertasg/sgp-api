package com.example.sgpapi.service;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sgpapi.entite.Banque;
import com.example.sgpapi.entite.Collaborateur;
import com.example.sgpapi.entite.Departement;
import com.example.sgpapi.repository.CollaborateurRepository;
import com.example.sgpapi.repository.DepartementRepository;

@Service
@Transactional
public class InitialiserDonneesServiceDev implements InitialiserDonneesService {

	@Autowired
	private CollaborateurRepository collabRepo;

	@Autowired
	private DepartementRepository departRepo;

	@Override
	public void initialiser() {

		Collaborateur collab1 = new Collaborateur();
		collab1.setMatricule("123456");
		collab1.setNom("le nom");
		collab1.setPrenom("le prénom");
		collab1.setDateNaissance(LocalDate.of(2018, 6, 1));
		collab1.setAdresse("une adresse");
		collab1.setNoSecu("123456789");
		collab1.setEmailPro("fdbugbdbuig@gmail.com");
		collab1.setDateHeureCreation(ZonedDateTime.now());
		collab1.setActif(true);

		Collaborateur collab2 = new Collaborateur();
		collab2.setMatricule("654321");
		collab2.setNom("le deuxième nom");
		collab2.setPrenom("le deuxième prénom");
		collab2.setDateNaissance(LocalDate.of(2018, 5, 1));
		collab2.setAdresse("une deuxième adresse");
		collab2.setNoSecu("987654321");
		collab2.setEmailPro("gfjhxfthtfghfghfghdth@gmail.com");
		collab2.setDateHeureCreation(ZonedDateTime.now());
		collab2.setActif(true);

		Departement departement1 = new Departement();
		departement1.setId(1);
		departement1.setNom("le département");

		Departement departement2 = new Departement();
		departement2.setId(2);
		departement2.setNom("le deuxième département");

		collab1.setDepartement(departement1);
		collab2.setDepartement(departement2);

		Banque banque1 = new Banque();
		banque1.setBic("bic123");
		banque1.setIban("iban123");
		banque1.setNomBanque("BNP");

		Banque banque2 = new Banque();
		banque2.setBic("bic456");
		banque2.setIban("iban456");
		banque2.setNomBanque("CA");

		collab1.setBanque(banque1);
		collab2.setBanque(banque2);

		departRepo.save(departement1);
		departRepo.save(departement2);

		collabRepo.save(collab1);
		collabRepo.save(collab2);
	}
}
