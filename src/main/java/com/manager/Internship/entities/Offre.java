package com.manager.Internship.entities;



import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.format.annotation.DateTimeFormat;




@Entity
public class Offre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@DateTimeFormat(pattern="yyyy-dd-MM")
	private Date debut;
	private Long duree;
	private String lieu;
	private String service;
	private String categorie;
	@ManyToOne
	@JoinColumn(name="id_User")
	private User user;
	@ManyToOne
	@JoinColumn(name="id_Visiteur")
	private Visiteur visiteur;
	
	public Offre() {
		super();
	}
	
	
	public Offre(Date debut, Long duree, String lieu, String service, String categorie, User user, Visiteur visiteur ) {
		this.debut=debut;
		this.duree=duree;
		this.lieu=lieu;
		this.service=service;
		this.categorie=categorie;
		this.user=user;
		this.visiteur=visiteur;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getDebut() {
		return debut;
	}


	public void setDebut(Date debut) {
		this.debut = debut;
	}


	public Long getDuree() {
		return duree;
	}


	public void setDuree(Long duree) {
		this.duree = duree;
	}


	public String getLieu() {
		return lieu;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Visiteur getVisiteur() {
		return visiteur;
	}


	public void setVisiteur(Visiteur visiteur) {
		this.visiteur = visiteur;
	}

	
	
	

}
