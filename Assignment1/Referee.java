package deu.Assignment1;

import deu.Assignment1.Adress.Phone;

public class Referee {

	private String name;
	private Adress adress;
	private Adress.Phone phone;
	public Referee(String name, Adress adress, Phone phone) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Adress.Phone getPhone() {
		return phone;
	}
	public void setPhone(Adress.Phone phone) {
		this.phone = phone;
	}
	
	
}
