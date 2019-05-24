package objects;

import java.util.ArrayList;

public class CheckedOut implements Crudable {

	ArrayList<Item> CheckedOut = new ArrayList<Item>();

	public ArrayList<Item> getCheckedOut() {
		return CheckedOut;
	}

	public void setCheckedOut(ArrayList<Item> checkedOut) {
		CheckedOut = checkedOut;
	}

	@Override
	public void create(Object input) {
		this.getCheckedOut().add((Item) input);

	}

	@Override
	public String read(Object input) {
		return null;
	}

	@Override
	public void update(Object input, Object change) {

	}

	@Override
	public void delete(Object input) {
		this.getCheckedOut().remove(input);

	}

}
