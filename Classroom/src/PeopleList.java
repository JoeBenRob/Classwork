import java.util.ArrayList;
import java.util.stream.Collectors;

public class PeopleList {

	private ArrayList<Person> people = new ArrayList<Person>();

	// setter
	public void setPersonList(ArrayList<Person> people) {
		this.people = people;
	}

	// getter
	public ArrayList<Person> getPersonList() {
		return people;

	}

	public void searchForName(String name) {
		System.out.println(people.stream().filter(Person -> Person.name.equals(name)).collect(Collectors.toList()));
	}
}