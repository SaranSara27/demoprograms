package com.cts.patterns;

public class SingletonImpl {

	public static void main(String[] args) {
		Team team_1 = Team.getTeamInstance();
		Team team_2 = Team.getTeamInstance();
		if(team_1.equals(team_2)) {
			System.out.println("Objects are Equal");
		}
	}

}
//Only one instance
class Team{
	private static Team team;
	private Team() {}
	public static synchronized Team getTeamInstance() {
		if(team==null) {
			team = new Team();
		}
		return team;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new CloneNotSupportedException();
	}
	
}