package dev.umairashraf.BookmarkingApp.managers;

import dev.umairashraf.BookmarkingApp.DataStore;
import dev.umairashraf.BookmarkingApp.dao.BookmarkDao;
import dev.umairashraf.BookmarkingApp.entities.Book;
import dev.umairashraf.BookmarkingApp.entities.Bookmark;
import dev.umairashraf.BookmarkingApp.entities.Movie;
import dev.umairashraf.BookmarkingApp.entities.WebLink;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();
private static BookmarkDao dao=new BookmarkDao();
private BookmarkManager() {
	};

	// public access menthod
	public static BookmarkManager getInstance() {

		return instance;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		return movie;
	}

	public WebLink createWebLink(long id, String title, String url, String host) {

		WebLink weblink = new WebLink();
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setUrl(url);
		weblink.setHost(host);

		return weblink;

	}

	public Book createBook(long id, String title, int publicationYear,String publisher, String[] author, String genre, double amazonRating ) {

		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setPublisher(publisher);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		book.setPublicationYear(publicationYear);

		return book;

	}
	
public Bookmark[][] getBookmarks(){
	return DataStore.getBookmarks();
}
}
