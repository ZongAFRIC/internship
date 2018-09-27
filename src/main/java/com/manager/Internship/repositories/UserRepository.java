package com.manager.Internship.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manager.Internship.entities.User;



public interface  UserRepository extends JpaRepository<User,Long>{
	
	//List<User>findByEmail(String email);
	
//	@Query("SELECT u.email FROM user u where u.email = :email") 
//    String findUserByEmail(@Param("email") String email);

}
