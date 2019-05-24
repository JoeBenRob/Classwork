package Logic;

import objects.Book;
import objects.ItemsList;

public class Runner {

	public static void main(String[] args) {

		Book book1 = new Book("Book", 001, 10, "The Fellowship of the Ring", "J.R.R.Tolkein", "Fantasy Adventure");

		ItemsList itemList = new ItemsList();
		itemList.create(book1);

	}

}