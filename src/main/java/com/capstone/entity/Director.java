package com.capstone.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Director")
public class Director {
	@Id
	private Integer Director_Id;
	private String First_name;
	private String Last_name;
	private String Address;
	private Long Contact_number;
	private String Email;
	
	@ManyToMany(mappedBy = "director")
	private Set<Movie> movie = new HashSet<>();
	
	public Set<Movie> getMovie() {
		return movie;
	}
	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Director(Integer director_Id, String first_name, String last_name, String address, Long contact_number,
			String email) {
		super();
		Director_Id = director_Id;
		First_name = first_name;
		Last_name = last_name;
		Address = address;
		Contact_number = contact_number;
		Email = email;
	}
	public Integer getDirector_Id() {
		return Director_Id;
	}
	public void setDirector_Id(Integer director_Id) {
		Director_Id = director_Id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Long getContact_number() {
		return Contact_number;
	}
	public void setContact_number(Long contact_number) {
		Contact_number = contact_number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Director [Director_Id=" + Director_Id + ", First_name=" + First_name + ", Last_name=" + Last_name
				+ ", Address=" + Address + ", Contact_number=" + Contact_number + ", Email=" + Email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, Contact_number, Director_Id, Email, First_name, Last_name, movie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Director other = (Director) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Contact_number, other.Contact_number)
				&& Objects.equals(Director_Id, other.Director_Id) && Objects.equals(Email, other.Email)
				&& Objects.equals(First_name, other.First_name) && Objects.equals(Last_name, other.Last_name)
				&& Objects.equals(movie, other.movie);
	}
	
	
	
	
}
