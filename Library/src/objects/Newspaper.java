package objects;

public class Newspaper extends Item {
	private String Organisation;
	private String date;

	public Newspaper(String type, int iID, int quantity, String organisation, String date) {
		super(type, iID, quantity);
		Organisation = organisation;
		this.date = date;
	}

	public String getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(String organisation) {
		Organisation = organisation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
