package objects;

public class Book extends Item {

	private String title;
	private String author;
	private String Genre;

	public Book(String type, int iID, int quantity, String title, String author, String genre) {
		super(type, iID, quantity);
		this.title = title;
		this.author = author;
		Genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

}
