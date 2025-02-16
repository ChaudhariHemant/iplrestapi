package com.project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TeamDao {

	List<Team> teams = new ArrayList();

	public TeamDao() {
		teams.add(new Team(1, "mi", 11));
		teams.add(new Team(2, "srh", 11));
		teams.add(new Team(3, "pkd", 11));
	}

	public Team giventeam(String teamName) {

		System.err.println("dao");

		if (teamName.equals("mi")) {
			return new Team(11, "mi", 11);
		} else if (teamName.equals("pkb")) {
			return new Team(11, "pkb", 11);
		} else {
			return new Team(16, "no team found", 23);
		}
	}

	public String deleteTeam(int id) {
		for (int i = 0; i < teams.size(); i++) {
			if (teams.get(i).getTeamId() == id) {
				teams.remove(i); // Removes the element at index `i`
				return "Team deleted successfully";
			}
		}
		return "Team not found";
	}

	public int deleteTeams(int id) {
		for (int i = 0; i < teams.size(); i++) {
			if (teams.get(i).getTeamId() == id) {
				teams.remove(i); // Removes the element at index `i`
				return 1;
			}
		}
		return 0;
	}

	public int updateTeam(int id, Team team) {
		for (int i = 0; i < teams.size(); i++) {
			if (teams.get(i).getTeamId() == id) {
				teams.set(i, team); // Replaces the old team with the new one
				return 1;
			}
		}
		return 0; // Return 0 if no team was found
	}
	

	public ArrayList<Team> allteam() {
		return new ArrayList<>(teams);

		// TODO Auto-generated method stub

	}

	
	public int deleteteam(int id) {
		for (Team team : teams) {
			if(team.getTeamId()==id) {
				teams.remove(team);
				return 1;
			}
		}
		return 0;
	}
	
	public int updateteam(int id,Team team) {
	 int status=deleteteam(id);
	  if(status==1) {
		  return 1;
	  }
	  else {
		  return 0;
	  }
	}

}
