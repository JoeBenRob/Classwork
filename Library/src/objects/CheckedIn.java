package objects;

import java.util.ArrayList;

public class CheckedIn implements Crudable {

	ArrayList<Item> CheckedIn = new ArrayList<Item>();

	public ArrayList<Item> getCheckedIn() {
		return CheckedIn;
	}

	public void setCheckedIn(ArrayList<Item> checkedIn) {
		CheckedIn = checkedIn;
	}

	@Override
	public void create(Object input) {
		this.getCheckedIn().add((Item) input);

	}

	@Override
	public String read(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object input, Object change) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object input) {
		this.getCheckedIn().remove(input);

	}

}
