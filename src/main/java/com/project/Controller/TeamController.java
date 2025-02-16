package com.project.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TeamController {
	@Autowired
	TeamService teamService;

	
	@GetMapping("/team")
	// GET http://localhost:8080/team?nameofteam=mi
	public Team giveteam(@RequestParam("nameofteam") String teamName) {
		System.out.println("Controller Layer Called");
		Team team = teamService.giveteam(teamName);
		return team;
	}
		


	@PostMapping("createTeam")
	// http://localhost:8080/createTeam
	public void create(@RequestBody Team team) {
		System.out.println(team);
	}

	@GetMapping("loadteamsnames/{teamid}")
  // http://localhost:8080/loadteamsnames/11
	ArrayList<String> fetchTeamName(@PathVariable("teamid") int idofteam) {
		System.out.println(idofteam);
		ArrayList<String> TeamList = new ArrayList<String>();
		TeamList.add("kkr");
		TeamList.add("mi");
		TeamList.add("csk");
		return TeamList;
	}
	
	


	@GetMapping("teamdetails")
	// http://localhost:8080/teamdetails
	Team teamDetails() {
		return new Team(11, "mi", 11);
	}


	@GetMapping("getAllteamwithDetails")
	// http://localhost:8080/getAllteamwithDetails
	ArrayList<Team> allteamdetails() {
		ArrayList<Team> teamList = new ArrayList<Team>();
		teamList.add(new Team(1, "mi", 11));
		teamList.add(new Team(2, "csk", 11));
		teamList.add(new Team(3, "ui", 11));
		return teamList;
	}
	
	@GetMapping("getAllteam")
	// http://localhost:8080/getAllteam
	ArrayList<Team> allteam() {
		 ArrayList<Team> allteams = teamService.allteam();
		 return allteams;
		 
	}
	 
	@DeleteMapping("deleteTeam/{x}")
	public String deleteTeam(@PathVariable ("x") int id) {
		return teamService.deleteTeam(id);
		}
	
	//using request param
	
	@DeleteMapping("deleteTeam")
	public int deleteTeams(@RequestParam ("idby")int id) {
		return teamService.deleteTeams(id);
		}
	
	@PutMapping("updateteam/{id}")
	public String updateTeam(@RequestBody Team team,@PathVariable int id) {
		String msg= teamService.updateTeam(id, team);
		return msg;
		
	}
	
	@DeleteMapping("deleteteam/{id}")
	public String deleteteam(@PathVariable int id) {
		return teamService.deleteteam(id);
	}
	
	@PutMapping("updateteams/{id}")
	public String updateteam(@RequestBody Team team,@PathVariable int id) {
		String msg= teamService.updateTeam(id, team);
		return msg;
		
	}
	
	
}
