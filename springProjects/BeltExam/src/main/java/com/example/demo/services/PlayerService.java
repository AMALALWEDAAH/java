package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Player;
import com.example.demo.models.Team;
import com.example.demo.repositories.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	private PlayerRepository playerRepository;
	
	public Player addPlayer(Player player, Team team) {
		player.setTeam(team);
		
		return playerRepository.save(player);
	}

	
}
