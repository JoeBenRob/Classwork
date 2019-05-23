package objects;

import java.util.ArrayList;

public class PeopleList {

	ArrayList<People> peopleList = new ArrayList<People>();

	// setter
	public void setPeopleList(ArrayList<People> peopleList) {
		this.peopleList = peopleList;
	}

	// getter
	public ArrayList<People> getPeopleList() {
		return peopleList;
	}
}
