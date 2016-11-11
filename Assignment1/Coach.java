package deu.Assignment1;

public class Coach {

	private String name;
	private Date startOfContract;
	private Date endOfContract;
	private int salary;
	private Adress adress;
	private Adress.Phone phone;
	
	public Coach(String name, Date startOfContract, Date endOfContract, int salary, Adress adress, Adress.Phone phone) {
		this.name = name;
		this.startOfContract = startOfContract;
		this.endOfContract = endOfContract;
		this.salary = salary;
		this.adress = adress;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartOfContract() {
		return startOfContract;
	}
	public void setStartOfContract(Date startOfContract) {
		this.startOfContract = startOfContract;
	}
	public Date getEndOfContract() {
		return endOfContract;
	}
	public void setEndOfContract(Date endOfContract) {
		this.endOfContract = endOfContract;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
