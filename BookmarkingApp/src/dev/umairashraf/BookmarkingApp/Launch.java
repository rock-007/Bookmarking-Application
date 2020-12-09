package dev.umairashraf.BookmarkingApp;


import dev.umairashraf.BookmarkingApp.entities.Bookmark;
import dev.umairashraf.BookmarkingApp.entities.User;
import dev.umairashraf.BookmarkingApp.managers.BookmarkManager;
import dev.umairashraf.BookmarkingApp.managers.UserManager;


public class Launch {
    private static User[] users;
    // this makes an empty bookmarking 2D array
    private static Bookmark[][] bookmarks;

    private static void loadData() {
        System.out.println("1. Loading data ...");
        DataStore.loadData();
        users = UserManager.getInstance().getUsers();
        //load the 2D array
        bookmarks = BookmarkManager.getInstance().getBookmarks();
        // System.out.println("Printing data ...");
        // printUserData();
        // printBookmarkData();
    }

    private static void printUserData() {
        for (User user : users) {

            System.out.println(user);
        }

    }

    private static void printBookmarkData() {
        for (Bookmark[] bookmarkList : bookmarks) {

            for (Bookmark bookmark : bookmarkList) {

                System.out.println(bookmark);
            }

        }

    }

    private static void start() {
       // System.out.println("\n2. Bookmarking ...");
        for (User user : users) {

            // View.bookmark(user, bookmarks);
            View.browse(user, bookmarks);
        }

    }

    public static void main(String[] args) {
        loadData();
        start();
    }
}
