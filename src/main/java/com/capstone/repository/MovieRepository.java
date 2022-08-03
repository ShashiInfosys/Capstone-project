package com.capstone.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.entity.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long>{
	List<Movie> findByName(String name);
	 @Transactional
	   @Modifying
	   @Query(value = "update  Movie set movie_released = ? " + " where movie_title = ?", nativeQuery = true)
   void updateMovieDate(LocalDate date,String name);
	 
	 @Transactional
	   @Modifying
	   @Query(value = "select  Movie.movie_title from movie join director", nativeQuery = true)
	 void movieList(String fname,String lname);
}
