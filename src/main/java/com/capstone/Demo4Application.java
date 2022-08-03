package com.capstone;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.capstone.entity.Director;
import com.capstone.entity.Movie;
import com.capstone.service.DirectorService;
import com.capstone.service.MovieService;

@SpringBootApplication
public class Demo4Application implements CommandLineRunner{

	@Autowired
	ApplicationContext context;
	@Autowired
	MovieService movieservice;
	
	@Autowired
	DirectorService directorservice;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Movie movidto =new Movie(1, "PK", LocalDate.now().minusDays(1), LocalDateTime.now());
		Director director1 = new Director(1,"RajKumar","Hirani","Mumbai",7869495995L,"rajkumar@gmail.com");
		movidto.getDirector().add(director1);
		director1.getMovie().add(movidto);
		
		//movieservice.insertMovie(director1);
		//movieservice.insertDirector(director1);
		movieservice.getAllMovies();
		directorservice.getAllDirector();
		
		movieservice.findMoviesByName("PK");
		movieservice.deleteMovieByName("MS Dhoni");
		movieservice.updateMovieReleaseByTitle(LocalDate.of(2000, 1, 10),"MS Dhoni");
		
		directorservice.updatedirectorDetails("Lucknow");
	}
	
	
	

}
