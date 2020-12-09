package dev.umairashraf.BookmarkingApp.controllers;


import dev.umairashraf.BookmarkingApp.entities.Bookmark;
import dev.umairashraf.BookmarkingApp.entities.User;
import dev.umairashraf.BookmarkingApp.managers.BookmarkManager;


public class BookmarkController {
    private static BookmarkController instance = new BookmarkController();

    private BookmarkController() {
    }

    public static BookmarkController getInstance() { // Global access point for
                                                     // one instance as its
                                                     // singleton
        return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
    }

    public void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) {
        BookmarkManager.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus, bookmark);
    }

    public void share(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().share(user, bookmark);
    }
}
