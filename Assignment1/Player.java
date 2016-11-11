package deu.Assignment1;

public class Player {

	private String licenseNumber;
	private String name;
	private Date birthdate;
	private String nationality;
	private Adress adress;
	private Adress.Phone phone;
	private int totalGoal;
	private String role;
	
	
	public Player(String licenseNumber, String name, Date birthdate, String nationality,
			Adress adress,Adress.Phone phone, int totalGoal, String role) {
		super();
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.birthdate = birthdate;
		this.nationality = nationality;
		this.adress = adress;
		this.phone = phone;
		this.totalGoal = totalGoal;
		this.role = role;
	}
	public Adress.Phone getPhone() {
		return phone;
	}
	public void setPhone(Adress.Phone phone) {
		this.phone = phone;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public int getTotalGoal() {
		return totalGoal;
	}
	public void setTotalGoal(int totalGoal) {
		this.totalGoal = totalGoal;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
