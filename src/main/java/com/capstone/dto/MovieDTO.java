package com.capstone.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Id;

import com.capstone.entity.Movie;

public class MovieDTO {
	@Id
	private Integer movie_Id;
	private String movie_Title;
	private LocalDate Date_Released;
	private LocalDateTime Movie_Running_Time;
	
	
	public MovieDTO(Integer movie_Id, String movie_Title, LocalDate date_Released, LocalDateTime movie_Running_Time) {
		super();
		this.movie_Id = movie_Id;
		this.movie_Title = movie_Title;
		Date_Released = date_Released;
		Movie_Running_Time = movie_Running_Time;
	}
	
	public Integer getMovie_Id() {
		return movie_Id;
	}
	public void setMovie_Id(Integer movie_Id) {
		this.movie_Id = movie_Id;
	}
	public String getMovie_Title() {
		return movie_Title;
	}
	public void setMovie_Title(String movie_Title) {
		this.movie_Title = movie_Title;
	}
	public LocalDate getDate_Released() {
		return Date_Released;
	}
	public void setDate_Released(LocalDate date_Released) {
		Date_Released = date_Released;
	}
	public LocalDateTime getMovie_Running_Time() {
		return Movie_Running_Time;
	}
	public void setMovie_Running_Time(LocalDateTime movie_Running_Time) {
		Movie_Running_Time = movie_Running_Time;
	}

	@Override
	public String toString() {
		return "MovieDTO [movie_Id=" + movie_Id + ", movie_Title=" + movie_Title + ", Date_Released=" + Date_Released
				+ ", Movie_Running_Time=" + Movie_Running_Time + "]";
	}

	public static Movie prepareMovieEntity(MovieDTO moviedto) {
		Movie movieEntity = new Movie();
		movieEntity.setMovie_Id(moviedto.getMovie_Id());
		movieEntity.setMovie_Title(moviedto.getMovie_Title());
		movieEntity.setDate_Released(moviedto.getDate_Released());
		movieEntity.setMovie_Running_Time(moviedto.getMovie_Running_Time());
		
		return movieEntity;
	}
	

	
	
	
	
}
