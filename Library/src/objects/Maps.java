package objects;

public class Maps extends Item {

	private String country;
	private String location;
	private String yearMade;

	public Maps(String type, int iID, int quantity, String country, String location, String yearMade) {
		super(type, iID, quantity);
		this.country = country;
		this.location = location;
		this.yearMade = yearMade;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getYearMade() {
		return yearMade;
	}

	public void setYearMade(String yearMade) {
		this.yearMade = yearMade;
	}

}