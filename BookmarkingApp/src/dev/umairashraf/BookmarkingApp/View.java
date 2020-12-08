package dev.umairashraf.BookmarkingApp;

import dev.umairashraf.BookmarkingApp.controllers.BookmarkController;
import dev.umairashraf.BookmarkingApp.entities.Bookmark;
import dev.umairashraf.BookmarkingApp.entities.User;

public class View {
    public static void bookmark(User user, Bookmark[][] bookmarks) {
        System.out.println("\n" + user.getEmail() + "is bookmarking");
        for (int i = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) {
            int typeOffset = (int) (Math.random()
                * DataStore.BOOKMARK_TYPES_COUNT); // index to get the type
            int bookmarkOffset = (int) (Math.random()
                * DataStore.BOOKMARK_COUNT_PER_TYPE); // to get the particular bookmark in particular type
            Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
BookmarkController.getInstance().saveUserBookmark(user,bookmark);
System.out.println(bookmark);
        }
    }
}
