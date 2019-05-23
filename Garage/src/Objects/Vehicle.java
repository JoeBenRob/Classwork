package Objects;

public abstract class Vehicle {

	private String name;
	private String paintColour;
	private int dateMade;
	private double price;

	public Vehicle(String name, String paintColour, int dateMade, double price) {
		this.name = name;
		this.paintColour = paintColour;
		this.dateMade = dateMade;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPaintColour(String paintColour) {
		this.paintColour = paintColour;
	}

	public void setDateMade(int dateMade) {
		this.dateMade = dateMade;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getPaintColour() {
		return paintColour;
	}

	public int getDateMade() {
		return dateMade;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Name = " + name + ", Paint Colour = " + paintColour + ", Date Made = " + dateMade + ", Price = "
				+ price;
	}
}