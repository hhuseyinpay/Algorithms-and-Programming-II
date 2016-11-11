package deu.Assignment1;

public class Sponsor {

	private String companyName;
	private Adress.Phone phone;
	private Date contratYear;
	
	
	public Sponsor(String companyName, Adress.Phone phone, Date contratYear) {
		super();
		this.companyName = companyName;
		this.phone = phone;
		this.contratYear = contratYear;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Adress.Phone getPhone() {
		return phone;
	}
	public void setPhone(Adress.Phone phone) {
		this.phone = phone;
	}
	public Date getContrat() {
		return contratYear;
	}
	public void setContratYear(Date contratYear) {
		this.contratYear = contratYear;
	}
	
}
