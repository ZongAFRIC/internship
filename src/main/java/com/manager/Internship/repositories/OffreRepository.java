package com.manager.Internship.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.Internship.entities.Offre;

public interface OffreRepository extends JpaRepository<Offre,Long> {
	
	//List<Offre> findByCategorie(String categorie);
	
	/*@Query("SELECT off.categorie FROM offre off where off.categorie = :categorie") 
    void findOffreByCategorie(@Param("categorie") String categorie);
	*/

}
