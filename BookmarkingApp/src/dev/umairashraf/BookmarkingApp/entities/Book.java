package dev.umairashraf.BookmarkingApp.entities;

import java.util.Arrays;

public class Book extends Bookmark {
	private String publisher;
	private String[] author;
	private String genre;
	private double amazonRating;
	private int publicationYear;

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getAmazonRating() {
		return amazonRating;
	}

	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}

	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", author=" + Arrays.toString(author) + ", genre=" + genre
				+ ", amazonRating=" + amazonRating + ", publicationYear=" + publicationYear + "]";
	}

}
