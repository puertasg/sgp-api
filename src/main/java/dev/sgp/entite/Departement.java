package dev.sgp.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departement", unique = true, nullable = false)
	private int id;

	@Column(name = "NOM", nullable = false)
	private String nom;

	@OneToMany(mappedBy = "departement")
	private List<Collaborateur> listeCollaborateurs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Collaborateur> getListeCollaborateurs() {
		return listeCollaborateurs;
	}

	public void setListeCollaborateurs(List<Collaborateur> listeCollaborateurs) {
		this.listeCollaborateurs = listeCollaborateurs;
	}
}
