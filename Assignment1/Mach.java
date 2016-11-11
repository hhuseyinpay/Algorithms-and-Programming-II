package deu.Assignment1;

public class Mach {

	private Team firstTeam;
	private Team secondTeam;
	private int fTGoal;
	private int sTGoal;
	
	
	
	public Mach(Team firstTeam, Team secondTeam, int fTGoal, int sTGoal) {
		super();
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.fTGoal = fTGoal;
		this.sTGoal = sTGoal;
	}

	public void start() {
		
		if (fTGoal > sTGoal) {
			firstTeam.addScore(3);
		}
		else if (fTGoal < sTGoal) {
			secondTeam.addScore(3);
		}
		else {
			firstTeam.addScore(1);
			secondTeam.addScore(1);
		}
	}
	
	public Team getFirstTeam() {
		return firstTeam;
	}
	public void setFirstTeam(Team firstTeam) {
		this.firstTeam = firstTeam;
	}
	public Team getSecondTeam() {
		return secondTeam;
	}
	public void setSecondTeam(Team secondTeam) {
		this.secondTeam = secondTeam;
	}
	public int getfTGoal() {
		return fTGoal;
	}
	public void setfTGoal(int fTGoal) {
		this.fTGoal = fTGoal;
	}
	public int getsTGoal() {
		return sTGoal;
	}
	public void setsTGoal(int sTGoal) {
		this.sTGoal = sTGoal;
	}
	
	
	
}
