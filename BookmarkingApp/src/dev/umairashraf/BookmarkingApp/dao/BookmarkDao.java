package dev.umairashraf.BookmarkingApp.dao;


import dev.umairashraf.BookmarkingApp.DataStore;
import dev.umairashraf.BookmarkingApp.entities.Bookmark;
import dev.umairashraf.BookmarkingApp.entities.UserBookmark;


public class BookmarkDao {
    public Bookmark[][] getBookmarks() {
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        // Can use here HQL or SQL but here we use .add
        DataStore.add(userBookmark); // inserting in DB
    }
}
