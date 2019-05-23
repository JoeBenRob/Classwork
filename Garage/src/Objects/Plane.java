package Objects;

public class Plane extends Vehicle implements cleanable {
	private int wingCount;
	private boolean international;
	private boolean propeller;

	public Plane(String name, String paintColour, int dateMade, double price, int wingCount, boolean international,
			boolean propeller) {
		super(name, paintColour, dateMade, price);
		this.wingCount = wingCount;
		this.international = international;
		this.propeller = propeller;
	}

	public void setSeaFaring(int wingCount) {
		this.wingCount = wingCount;
	}

	public void setInternational(boolean international) {
		this.international = international;
	}

	public void setPropeller(boolean propeller) {
		this.propeller = propeller;
	}

	public int getWingCount() {
		return wingCount;
	}

	public boolean getType() {
		return international;
	}

	public boolean getOpArea() {
		return propeller;
	}

	public String toString() {
		return super.toString() + ", Wing Count = " + wingCount + ", International = " + international
				+ ", Propeller = " + propeller + "\n\r";
	}

	@Override
	public String isCleanable() {
		return "Yes, but is difficult to clean";
	}

}
