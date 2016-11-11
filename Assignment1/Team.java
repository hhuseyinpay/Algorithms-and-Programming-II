package deu.Assignment1;

public class Team {

	private String teamID; 
	private String name;
	private String foundationYear;
	private int star;
	private String cups;
	private String color1, color2;
	private Coach coach;
	private int score;
	private Player[] players = new Player[25];
	private int playerCounter;
	private Sponsor[] sponsors = new Sponsor[10];
	private int sponsorCounter;

	public Team(String teamID, String name, String foundationYear, int star, String cups, String color1, String color2,
			Coach coach, int score) {
		this.teamID = teamID;
		this.name = name;
		this.foundationYear = foundationYear;
		this.star = star;
		this.cups = cups;
		this.color1 = color1;
		this.color2 = color2;
		this.coach = coach;
		this.score = score;
		playerCounter = 0;
		sponsorCounter = 0;
	}

	public String getTeamID() {
		return teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoundationYear() {
		return foundationYear;
	}

	public void setFoundationYear(String foundationYear) {
		this.foundationYear = foundationYear;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getCups() {
		return cups;
	}

	public void setCups(String cups) {
		this.cups = cups;
	}

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void addPlayer(Player player) {

		players[playerCounter] = player;
		playerCounter++;

	}

	public void displayPlayer() {

		for (int i = 0; i < playerCounter; i++) {
			System.out.println(players[i].getName());
		}
	}

	public void addSponsor(Sponsor sponsor) {
		this.sponsors[sponsorCounter] = sponsor;
		sponsorCounter++;
	}

	public void displaySponsor() {
		for (int i = 0; i < sponsorCounter; i++) {
			System.out.print(sponsors[i].getCompanyName());
		}
		System.out.println("");
	}
	
	public void addScore(int score) {
		
		this.score += score;
	}

}
