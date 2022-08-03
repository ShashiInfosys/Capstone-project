package com.capstone.dto;

import com.capstone.entity.Director;

public class DirectorDTO {
	private Integer Director_Id;
	private String First_name;
	private String Last_name;
	private String Address;
	private Long Contact_number;
	private String Email;
	
	public DirectorDTO(Integer director_Id, String first_name, String last_name, String address, Long contact_number,
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
		return "DirectorDTO [Director_Id=" + Director_Id + ", First_name=" + First_name + ", Last_name=" + Last_name
				+ ", Address=" + Address + ", Contact_number=" + Contact_number + ", Email=" + Email + "]";
	}
	
	public static Director prepareDirectorentity(DirectorDTO directordto)
	{
		Director dientity=new Director();
		dientity.setDirector_Id(directordto.getDirector_Id());
		dientity.setFirst_name(directordto.getFirst_name());
		dientity.setLast_name(directordto.getLast_name());
		dientity.setContact_number(directordto.getContact_number());
		dientity.setEmail(directordto.getEmail());
		dientity.setAddress(directordto.getAddress());
		
		return dientity;
		
	}
	
	
}
