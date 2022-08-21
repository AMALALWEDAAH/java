package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.House;
import com.example.demo.models.Team;
import com.example.demo.models.User;
import com.example.demo.repositories.TeamRepository;



@Service
public class TeamService {

	private final TeamRepository teamRepository;
	public TeamService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
		}
	// returns all the team
		public List<Team> allTeams() {
			return teamRepository.findAll();
			}
		// creates a team
		public Team createTeam(Team h ,User user) {
			h.setUser(user);
			return teamRepository.save(h);
			}
		
		// retrieves a team
		public Team findTeam(Long id) {
			Optional<Team> optionalHouse = teamRepository.findById(id);
			if(optionalHouse.isPresent()) {
				return optionalHouse.get();
				} else {
					return null;
					}
			}
	
		
		public void deleteTeam(Long id) {
			// TODO Auto-generated method stub
			teamRepository.deleteById(id);
		}
		public Team updateTeam(Team house,User user) {
			house.setUser(user);
			return teamRepository.save(house);
		}
}

