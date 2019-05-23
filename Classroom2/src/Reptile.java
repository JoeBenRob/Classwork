
public class Reptile extends Animal {

	private String scaleColour;
	private String eyeColour;
	private boolean amphibious;

	public Reptile(String name, double weight, int age, String location, String scaleColour, String eyeColour,
			boolean amphibious) {
		super(name, weight, age, location);
		this.scaleColour = scaleColour;
		this.eyeColour = eyeColour;
		this.amphibious = amphibious;
	}

	public String getScaleColour() {
		return scaleColour;
	}

	public String getEyeColour() {
		return eyeColour;
	}

	public Boolean getAmphibious() {
		return amphibious;
	}

}
