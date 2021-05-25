package common;

public class Book {

	private String author;
	private String title,lastTitle;
	private int year;

	public Book(String author, String title, int publishingYear) {
		this.author = author;
		this.title = title;
		this.lastTitle = "";
		year = publishingYear;
	}
	
	public void setTitle(String newTitle) {
		lastTitle = title;
		title = newTitle;
	}
	
	
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}
	
	public int howOldIsThisBook() {
		return 2021-year;
	}
}
