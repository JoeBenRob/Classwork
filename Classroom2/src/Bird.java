
public class Bird extends Animal {

	private String colour;
	private boolean flight;
	private int wingSpan;

	public Bird(String name, double weight, int age, String location, String colour, boolean flight, int wingSpan) {
		super(name, weight, age, location);
		this.colour = colour;
		this.flight = flight;
		this.wingSpan = wingSpan;

	}

	public String getColour() {
		return colour;
	}

	public boolean getFlight() {
		return flight;
	}

	public int getWingSpan() {
		return wingSpan;

	}

}
