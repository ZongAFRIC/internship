package com.manager.Internship.entities;



import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Visiteur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String adresse;
	private String reference;
	private String lienOffre;
	
	@OneToMany(mappedBy="visiteur",cascade=CascadeType.ALL)
	private Collection<Offre>offres;
	
//	public Visiteur() {
//		super();
//	}

	public Visiteur(String adresse, String reference, String lienOffre) {
		super();
		this.adresse=adresse;
		this.reference=reference;
		this.lienOffre=lienOffre;
	}
	
	public Collection<Offre> getOffres() {
		return offres;
	}


	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}


	public Visiteur () {
		super();
	}
	
	
	public Visiteur(String reference,String lienoffre) {
		this.reference=reference;
		this.lienOffre=lienoffre;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getLienOffre() {
		return lienOffre;
	}


	public void setLienOffre(String lienOffre) {
		this.lienOffre = lienOffre;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	

}
