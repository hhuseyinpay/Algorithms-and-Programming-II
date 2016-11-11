package deu.Assignment1;

public class TFF {

	private League[] leagues;
	private int leaguesCounter;

	private Stadium[] stadiums;
	private int stadiumCounter;

	private Referee[] refereess;
	private int refereeCounter;

	public TFF(int sizeOfLeague) {
		leagues = new League[sizeOfLeague];
		stadiums = new Stadium[60];
		refereess = new Referee[500];
		leaguesCounter = 0;
		stadiumCounter = 0;
		refereeCounter = 0;
	}

	public void addLeague(League league) {
		leagues[leaguesCounter] = league;
		leaguesCounter++;
	}

	public void addStadium(Stadium stadium) {
		stadiums[stadiumCounter] = stadium;
		stadiumCounter++;
	}

	public void addReferee(Referee referee) {
		refereess[refereeCounter] = referee;
		refereeCounter++;
	}

	public void list() {
		// sadece super lig yazılacağı için leagues[0] kullanılmıştır.
		for (int i = 0; i < leagues[0].getTeam().length; i++) {
			System.out.println("\nTeam: " + leagues[0].getTeam()[i].getName());
			System.out.println("Coach: " + leagues[0].getTeam()[i].getCoach().getName());
			System.out.print("Sponsors: ");
			leagues[0].getTeam()[i].displaySponsor();// fonksiyon ekrana yazacak
			System.out.println("Players: ");
			leagues[0].getTeam()[i].displayPlayer();// fonksiyon ekrana yazacak
		}
	}

	public Team searchTeam(String team) {  
		for (int i = 0; i < leagues[0].getTeam().length; i++)
			if (leagues[0].getTeam()[i].getTeamID().equalsIgnoreCase(team))
				return leagues[0].getTeam()[i];

		return null;
	}

	public void machInfo(Team firstTeam, Team secondTeam, int fTGoal, int sTGoal) {
		Mach mach = new Mach(firstTeam, secondTeam, fTGoal, sTGoal);
		mach.start();
	}
	
	public String findWinner(){
		int winnerScore = 0;
		String winnerName= "";
		for (int i = 0; i < leagues[0].getTeam().length; i++) {
			if (leagues[0].getTeam()[i].getScore() > winnerScore) {
				winnerScore = leagues[0].getTeam()[i].getScore();
				winnerName =leagues[0].getTeam()[i].getName();
			}
			
			
		}	
		return winnerName;
	}

}
