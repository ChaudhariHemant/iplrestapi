package com.project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
	@Autowired
	TeamDao teamDao;

	public Team giveteam(String teamName) {
		System.err.println("service");

		Team team = teamDao.giventeam(teamName);
		return team;
	}

	public String deleteTeam(int id) {
		return teamDao.deleteTeam(id);

		// String msg=teamDao.deleteTeam(id);
		// return msg;
	}

	public int deleteTeams(int id) {
		// TODO Auto-generated method stub
		return teamDao.deleteTeams(id);

	}

	public String updateTeam(int id, Team team) {
		int status = teamDao.updateTeam(id, team);
		if (status == 0) {
			return "team not found to update";
		} else {
			return "team is updated";
		}

	}

	public ArrayList<Team> allteam() {
		ArrayList<Team> allteam = teamDao.allteam();
		return allteam;
		// TODO Auto-generated method stub

	}

	public String deleteteam(int id) {
		int status = teamDao.deleteteam(id);
		if (status == 0) {
			return "team not found to deleted";
		} else {
			return "team deleted";
		}
	}
	
	public String updateteam(int id,Team team) {
		int status=teamDao.updateteam(id, team);
		if (status == 0) {
			return "team not found to update";
		} else {
			return "team updated";
		}
	}

}
