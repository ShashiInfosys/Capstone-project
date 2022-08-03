package com.capstone.service;

import java.time.LocalDate;

import com.capstone.dto.MovieDTO;
import com.capstone.entity.Movie;

public interface MovieService {
	public void insertMovie(MovieDTO moviedto);
	public void insertMovie_Director(Movie movie);
	public void getAllMovies();
	public void findMoviesByName(String name)throws Exception;
	public void deleteMovieByName(String name) throws Exception;
	public void updateMovieReleaseByTitle(LocalDate date , String name);

}
