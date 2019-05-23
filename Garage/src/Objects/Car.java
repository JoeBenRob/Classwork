package Objects;

public class Car extends Vehicle implements cleanable {

	private String engineSize;
	private int doorCount;
	private boolean automatic;

	public Car(String name, String paintColour, int dateMade, double price, String engineSize, int doorCount,
			boolean automatic) {
		super(name, paintColour, dateMade, price);
		this.engineSize = engineSize;
		this.doorCount = doorCount;
		this.automatic = automatic;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public boolean getAutomatic() {
		return automatic;
	}

	public String toString() {
		return super.toString() + ", Engine Size = " + engineSize + ", Door Count = " + doorCount + ", Automatic = "
				+ automatic + "\n\r";
	}

	@Override
	public String isCleanable() {
		return "Yes, this vehicle is easily cleanable";
	}
}
