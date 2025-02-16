package com.project.Controller;

public class Team {
      int TeamId;
      String teamName;
      int teamPlayerCount;
	public Team() {
		super();
	}
	public Team(int teamId, String teamName, int teamPlayerCount) {
		super();
		TeamId = teamId;
		this.teamName = teamName;
		this.teamPlayerCount = teamPlayerCount;
	}
	public int getTeamId() {
		return TeamId;
	}
	public void setTeamId(int teamId) {
		TeamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamPlayerCount() {
		return teamPlayerCount;
	}
	public void setTeamPlayerCount(int teamPlayerCount) {
		this.teamPlayerCount = teamPlayerCount;
	}
	@Override
	public String toString() {
		return "Team [TeamId=" + TeamId + ", teamName=" + teamName + ", teamPlayerCount=" + teamPlayerCount + "]";
	}
      
      
      
}
