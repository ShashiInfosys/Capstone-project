package com.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.dto.DirectorDTO;
import com.capstone.entity.Director;
import com.capstone.repository.DirectorRepository;


public class DirectorServiceImpl implements DirectorService{

	@Autowired
	DirectorRepository directorRepository;
	
	@Override
	public void insertDirector(DirectorDTO directordto) {
		// TODO Auto-generated method stub
		directorRepository.saveAndFlush(DirectorDTO.prepareDirectorentity(directordto));
	}

	@Override
	public void getAllDirector() {
		// TODO Auto-generated method stub
		List<Director> list =directorRepository.findAll();
		list.stream().forEach(System.out::println);
	}

	@Override
	public void updatedirectorDetails(String address) {
		// TODO Auto-generated method stub
		directorRepository.updateDirdetails(address);
		
	}

}
