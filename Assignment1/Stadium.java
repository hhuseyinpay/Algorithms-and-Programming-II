package deu.Assignment1;

public class Stadium {

	private String name;
	private String city;
	private int capacity;
	private String size;
	private boolean isLight;
	private String surface;
	
	
	public Stadium(String name,String city, int capacity, String size, boolean isLight,
			String surface) {
		this.name = name;
		this.city = city;
		this.capacity = capacity;
		this.size = size;
		this.isLight = isLight;
		this.surface = surface;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public boolean isLight() {
		return isLight;
	}


	public void setLight(boolean isLight) {
		this.isLight = isLight;
	}


	public String getSurface() {
		return surface;
	}


	public void setSurface(String surface) {
		this.surface = surface;
	}
	
	
}
