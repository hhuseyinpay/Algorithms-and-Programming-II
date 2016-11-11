package deu.Assignment1;

public class League {

	private String name;
	private Team[] teams;
	private int teamCounter;
	private String[] group;
	private int groupCounter;

	public League(String name, int numberOfTeam) {
		this.name = name;
		teams = new Team[numberOfTeam];
		group = new String[7];
		teamCounter = 0;
		groupCounter = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team[] getTeam() {
		return teams;
	}

	public void setTeam(Team[] team) {
		this.teams = team;
	}

	public String[] getGroup() {
		return group;
	}

	public void setGroup(String[] group) {
		this.group = group;
	}

	public void addTeam(Team team){
		this.teams[teamCounter] = team;
		teamCounter++;
	}
	public void groupAdd(String group) {
		this.group[groupCounter] = group;
		groupCounter++;
	}
	
}
