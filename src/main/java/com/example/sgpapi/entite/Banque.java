package com.example.sgpapi.entite;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Banque {
	
	@Column(name="NOM_BANQUE", nullable = false)
	private String nomBanque;

	@Column(name = "IBAN", nullable = false)
	private String iban;

	@Column(name = "BIC", nullable = false)
	private String bic;

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}
	
	public String getNomBanque() {
		return nomBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}
}
