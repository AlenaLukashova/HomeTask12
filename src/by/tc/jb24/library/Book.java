package by.tc.jb24.library;

public class Book extends PrintEdition {
	private String author;
	private int yearPublished;
	private int pages;
	private String page;
	private String publicationYear;

	public Book() {
	}

	public Book(String title, String publisher, String author,
			int yearPublished, int pages) {
		super(title, publisher);
		this.author = author;
		this.yearPublished = yearPublished;
		this.pages = pages;
	}

	public Book(String title, int yearPublished) {
		super(title);
		this.yearPublished = yearPublished;
	}

	public Book(String title, String publisher, String author,
			String publicationYear, String page) {
		super(title, publisher);
		this.author = author;
		this.publicationYear = publicationYear;
		this.page = page;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book Title: " + getTitle() + ", Publisher: " + getPublisher() + ", Author: " + author + ", Publication Year: " + publicationYear + ", Pages: " + page + ";";
	}
}
