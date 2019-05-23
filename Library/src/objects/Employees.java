package objects;

public class Employees extends People {
	private int id;
	private String role;
	private int hours;

	public Employees(String name, int age, String occupation, int id, String role, int hours) {
		super(name, age, occupation);
		this.id = id;
		this.role = role;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
