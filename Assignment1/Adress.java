package deu.Assignment1;

public class Adress {

	private String city;
	private String neighbourhood;
	private String street;

	public Adress() {
		// TODO Auto-generated constructor stub
	}
	public Adress(String city, String neighbourhood, String street) {
		this.city = city;
		this.neighbourhood = neighbourhood;
		this.street = street;

		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public class Phone {
		private String countryCode;
		private String code; // (city or mobile operator)
		private String number; // (7 digits)
		private String type; // (home, office or mobile)

		public Phone(String countryCode, String code, String number, String type) {
			super();
			this.countryCode = countryCode;
			this.code = code;
			this.number = number;
			this.type = type;
		}

		public Phone(String code, String number, String type) {
			super();
			this.countryCode = "+90";
			this.code = code;
			this.number = number;
			this.type = type;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

}
