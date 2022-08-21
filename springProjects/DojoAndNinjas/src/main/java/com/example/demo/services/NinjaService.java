package com.example.demo.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepoitory;

			public  Ninja createNinja(@Valid Ninja ninja) {
				// TODO Auto-generated method stub
				return ninjaRepoitory.save(ninja);
				}

}
