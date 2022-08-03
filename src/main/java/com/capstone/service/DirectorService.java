package com.capstone.service;

import com.capstone.dto.DirectorDTO;

public interface DirectorService {
	public void insertDirector(DirectorDTO directordto);
	public void getAllDirector();
	public void updatedirectorDetails(String address);
}
