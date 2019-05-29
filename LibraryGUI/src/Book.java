
public class Book {
	private String ISBN;
	private String Title;
	private String Author;
	private String Edition;
	private String publishedYear;
	private boolean Borrowed;

	public Book(String ISBN, String Title, String Author, String Edition, String publishedYear) {
		this.ISBN = ISBN;

		if (Title.equals(""))
			this.Title = "-";
		else
			this.Title = Title;

		if (Author.equals(""))
			this.Author = "-";
		else
			this.Author = Author;

		if (Edition.equals(""))
			this.Edition = "0";
		else
			this.Edition = Edition;

		if (publishedYear.equals(""))
			this.publishedYear = "0";
		else
			this.publishedYear = publishedYear;
		Borrowed = false;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getTitle() {
		return Title;
	}

	public void setAuthor(String Author) {
		this.Author = Author;
	}

	public String getAuthor() {
		return Author;
	}

	public void setEdition(String Edition) {
		this.Edition = Edition;
	}

	public String getEdition() {
		return Edition;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setBorrowed(boolean b) {
		this.Borrowed = b;
	}

	public boolean isBorrowed() {
		return Borrowed;
	}
}
