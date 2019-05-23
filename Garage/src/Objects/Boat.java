package Objects;

public class Boat extends Vehicle implements cleanable {
	private boolean seafaring;
	private String type;
	private double speed;

	public Boat(String name, String paintColour, int dateMade, double price, boolean seafaring, String type,
			double speed) {
		super(name, paintColour, dateMade, price);
		this.seafaring = seafaring;
		this.type = type;
		this.speed = speed;
	}

	public void setSeaFaring(boolean seafaring) {
		this.seafaring = seafaring;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOpArea(double speed) {
		this.speed = speed;
	}

	public boolean getSeaFaring() {
		return seafaring;
	}

	public String getType() {
		return type;
	}

	public double getSpeed() {
		return speed;
	}

	public String toString() {
		return super.toString() + ", Seafaring = " + seafaring + ", Type = " + type + ", OpArea = " + speed + "\n\r";
	}

	@Override
	public String isCleanable() {
		return "Yes, but very difficult";
	}
}
