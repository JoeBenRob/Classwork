
public class Mamal extends Animal {

	private double hairLength;
	private int legs;
	private String eyeColour;

	public Mamal(String name, double weight, int age, String location, double hairLength, int legs, String eyeColour) {
		super(name, weight, age, location);
		this.hairLength = hairLength;
		this.legs = legs;
		this.eyeColour = eyeColour;
	}

	public double getHairLength() {
		return hairLength;
	}

	public int getLegs() {
		return legs;
	}

	public String getEyeColour() {
		return eyeColour;
	}
}
