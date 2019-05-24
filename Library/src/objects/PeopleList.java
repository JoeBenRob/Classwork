package objects;

import java.util.ArrayList;

public class PeopleList implements Crudable {
	private ArrayList<People> peopleList = new ArrayList<People>();

	public void setPeopleList(ArrayList<People> peopleList) {
		this.peopleList = peopleList;
	}

	public ArrayList<People> getPeopleList() {
		return peopleList;
	}

	@Override
	public void create(Object input) {
		this.getPeopleList().add((People) input);
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
		this.getPeopleList().remove(input);
	}
}
