public class Runner {

	public static void main(String[] args) {

		// Q3)
		Person p1 = new Person("Ben", 25, "Truck Driver");
		Person p2 = new Person("Rob", 26, "Butcher");
		// System.out.println(p1);

		// Q4)
		PeopleList people = new PeopleList();
		people.getPersonList().add(p1);
		people.getPersonList().add(p2);

		// Q5)
		System.out.println(people.getPersonList());

		// Q6)
		System.out.println(people.searchForName("Ben"));
		
		public void searchName(String name) {
			List<Person> searchedName = people.stream().filter(p -> name.equals(p1.getName()).collect(Collectors.tolist()));
			System.out.println(searchedName);
		}
	}

}
