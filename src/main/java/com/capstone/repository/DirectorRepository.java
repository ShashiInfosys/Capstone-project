package com.capstone.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Object>{
	List<Director> findByName(String fname, String lname);
	
	 @Transactional
	   @Modifying
	   @Query(value = "update  Director set address = ? ", nativeQuery = true)
	void updateDirdetails(String address);
}
