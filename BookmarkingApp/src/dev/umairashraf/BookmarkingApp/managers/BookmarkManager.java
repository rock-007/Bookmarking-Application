package dev.umairashraf.BookmarkingApp.managers;

import dev.umairashraf.BookmarkingApp.entities.Movie;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();

	private BookmarkManager() {
	};

	// public access menthod
	public static BookmarkManager getInstance() {

		return instance;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors,
			String genre, double imdbRating) {
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
}
