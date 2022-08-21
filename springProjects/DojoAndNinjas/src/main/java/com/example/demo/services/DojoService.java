package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Dojo;
import com.example.demo.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepository;
	
	
		public Dojo createDojo(@Valid Dojo d) {
		return dojoRepository.save(d);
		}

		public Dojo findById(Long dojo_id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Dojo> allDojos() {
			// TODO Auto-generated method stub
			return dojoRepository.findAll();
		}
		
		public Dojo findDojo(Long id)	{
			Optional<Dojo> dojo = dojoRepository.findById(id);
			if(dojo.isPresent()) {
				return dojo.get();
			}else {
				return null;
			}
		}
				
				

}
