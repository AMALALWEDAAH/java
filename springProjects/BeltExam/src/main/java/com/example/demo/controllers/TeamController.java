package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.House;
import com.example.demo.models.Player;
import com.example.demo.models.Team;
import com.example.demo.services.PlayerService;
import com.example.demo.services.TeamService;
import com.example.demo.services.UserService;



@Controller
public class TeamController {

	@Autowired
	TeamService teamService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	PlayerService pLayerService;
	
	@GetMapping("home/{teamId}")
    public String show(Model model,@PathVariable("teamId")Long teamId,HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		if(userId != null) {
		com.example.demo.models.User user=userService.findUserById(userId);
		model.addAttribute("user", user);
        Team team=teamService.findTeam(teamId);
        model.addAttribute("team", team);
        return "Show.jsp";
		}else {
			return "redirect:/";
		}
    }
	
	@RequestMapping("/home")
    public String index(Model model, HttpSession session) {
		Long id = (Long)session.getAttribute("user_id");
		if(id != null) {
			com.example.demo.models.User user = userService.findUserById(id);
			List<Team> teams = teamService.allTeams();
			model.addAttribute("user", user);
			model.addAttribute("teams", teams);
			return "home.jsp";
		}else {
			return "redirect:/";
		}
        }
	
	@GetMapping("/home/new")
    public String newHouse(@ModelAttribute("team") Team team) {
        return "New.jsp";
    }
    @PostMapping("/home")
    public String create(@Valid @ModelAttribute("team") Team team, BindingResult result,HttpSession session) {
        if (result.hasErrors()) {
            return "New.jsp";
        } else {
            Long id = (Long)session.getAttribute("user_id");
            com.example.demo.models.User user = userService.findUserById(id);

            teamService.createTeam(team,(com.example.demo.models.User) user);
            return "redirect:/home";
        }
    }
    
    
    @GetMapping("/home/{id}/edit")
    public String edit(@ModelAttribute("updatedTeam") Team team, @PathVariable("id") Long id, HttpSession session, Model model) {
		Long user_id = (Long) session.getAttribute("user_id") ;
		if(user_id != null) {
			Team team1 = teamService.findTeam(id);
        model.addAttribute("team", team1);
        return "Edit.jsp";
    }else {
    	return "redirect:/";
    }
    }
    @PutMapping("/home/{id}/edit")
    public String update(@Valid @ModelAttribute("updatedTeam") Team team, BindingResult result, @PathVariable("id") Long id, HttpSession session) {
    	
        if (result.hasErrors()) {
            return "Edit.jsp";
        } else {
        	Long userId = (Long) session.getAttribute("user_id");
    		User user = (User) userService.findUserById(userId);
    		teamService.updateTeam(team,(com.example.demo.models.User) user);
            return "redirect:/home";
        }
		
    }
    
    @RequestMapping(value="/{id}/delete",method={RequestMethod.GET, RequestMethod.POST})
    public String delete(@PathVariable("id") Long id) {
    	teamService.deleteTeam(id);
		return "redirect:/home";
    	
    }
}
