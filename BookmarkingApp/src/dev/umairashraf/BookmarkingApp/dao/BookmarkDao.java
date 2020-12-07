package dev.umairashraf.BookmarkingApp.dao;

import dev.umairashraf.BookmarkingApp.DataStore;
import dev.umairashraf.BookmarkingApp.entities.Bookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks() {
		
		return DataStore.getBookmarks();
	}
}
