package objects;

public class Book extends Item {

	private String title;
	private String author;
	private String genre;
	private String edition;

	public Book(String type, int iID, int quantity, String title, String author, String genre) {
		super(type, iID, quantity);
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public Book(String type, int iID, int quantity, String title, String author, String genre, String edition) {
		super(type, iID, quantity);
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.edition = edition;
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
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

}
