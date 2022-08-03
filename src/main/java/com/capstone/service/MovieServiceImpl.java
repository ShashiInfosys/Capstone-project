package com.capstone.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capstone.dto.DirectorDTO;
import com.capstone.dto.MovieDTO;
import com.capstone.entity.Movie;
import com.capstone.repository.MovieRepository;

@Transactional
@Service("movieService")
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieRepository movieRepository;

	@Override
	public void insertMovie(MovieDTO moviedto) {
		movieRepository.saveAndFlush(MovieDTO.prepareMovieEntity(moviedto));
	}

	@Override
	public void insertMovie_Director(Movie movie) {
		// TODO Auto-generated method stub
		movieRepository.save(movie);
	}

	@Override
	public void getAllMovies() {
		// TODO Auto-generated method stub
		List<Movie> list = movieRepository.findAll();
		list.stream().forEach(System.out::println);
	}

	@Override
	public void findMoviesByName(String name) throws Exception {
		// TODO Auto-generated method stub
		List<Movie> list = movieRepository.findByName(name);
		if(list.isEmpty()) {
			System.out.println("Invalid Movie title");
		}else {
			list.stream().forEach(System.out::println);
		}
	}

	@Override
	public void deleteMovieByName(String name) throws Exception {
		// TODO Auto-generated method stub
		List<Movie> list = movieRepository.findByName(name);
		if(list.isEmpty()) {
			System.out.println("Movie with the given title is not present");
		}else {
			movieRepository.deleteAll(list);
		}
	}

	@Override
	public void updateMovieReleaseByTitle(LocalDate date, String name) {
		// TODO Auto-generated method stub
		movieRepository.updateMovieDate(date,name);
	}


}
