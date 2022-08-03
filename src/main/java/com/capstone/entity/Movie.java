package com.capstone.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id
	private Integer movie_Id;
	private String movie_Title;
	private LocalDate Date_Released;
	private LocalDateTime Movie_Running_Time;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="moviedirector",joinColumns={@JoinColumn(name="movie_Id")},
	inverseJoinColumns = {@JoinColumn(name = "Director_Id")})
	
	Set<Director> director = new HashSet<>();
	
	public Movie()
	{}
	public Movie(Integer movie_Id, String movie_Title, LocalDate date_Released, LocalDateTime movie_Running_Time) {
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
	public void setMovie_Running_Time(LocalDateTime localDateTime) {
		Movie_Running_Time = localDateTime;
	}
	@Override
	public String toString() {
		return "Movie [movie_Id=" + movie_Id + ", movie_Title=" + movie_Title + ", Date_Released=" + Date_Released
				+ ", Movie_Running_Time=" + Movie_Running_Time + ", director=" + director + "]";
	}
	public Set<Director> getDirector() {
		return director;
	}
	public void setDirector(Set<Director> director) {
		this.director = director;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Date_Released, Movie_Running_Time, director, movie_Id, movie_Title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(Date_Released, other.Date_Released)
				&& Objects.equals(Movie_Running_Time, other.Movie_Running_Time)
				&& Objects.equals(director, other.director) && Objects.equals(movie_Id, other.movie_Id)
				&& Objects.equals(movie_Title, other.movie_Title);
	}
	
	
	
}
