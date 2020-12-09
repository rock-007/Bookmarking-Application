package dev.umairashraf.BookmarkingApp;


import dev.umairashraf.BookmarkingApp.constants.KidFriendlyStatus;
import dev.umairashraf.BookmarkingApp.constants.UserType;
import dev.umairashraf.BookmarkingApp.controllers.BookmarkController;
import dev.umairashraf.BookmarkingApp.entities.Bookmark;
import dev.umairashraf.BookmarkingApp.entities.User;
import dev.umairashraf.BookmarkingApp.entities.partner.Shareable;
import dev.umairashraf.BookmarkingApp.managers.BookmarkManager;


public class View {
    public static void browse(User user, Bookmark[][] bookmarks) {
        System.out.println("\n" + user.getEmail() + "is browsing items...");
        int bookmarkCount = 0;
        System.out.println("1-yyyyxx---" + bookmarks);
        for (Bookmark[] bookmarkList : bookmarks) {

            System.out.println("yyyy" + bookmarkList);
            for (Bookmark bookmark : bookmarkList) {

                System.out.println("2-yyyyxx---" + bookmark);
                // BookmaRKING!!
                if (bookmarkCount < DataStore.USER_BOOKMARK_LIMIT) {

                    boolean isBookmarked = getBookmarkDecision(bookmark);
                    if (isBookmarked) {

                        bookmarkCount++;
                        BookmarkController.getInstance().saveUserBookmark(user, bookmark);
                        System.out.println("New Item added" + bookmark);
                    }

                }

                if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(
                    UserType.CHIEF_EDITOR)) {
                    // mark as kid-friendly by editor or chielf editor

                    if (bookmark.iskidFriendlyEligible() && bookmark.getKidFriendlyStatus()
                        .equals(KidFriendlyStatus.UNKNOWN)) {

                        String kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
                        if (!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) {

                            BookmarkController.getInstance().setKidFriendlyStatus(user,
                                kidFriendlyStatus, bookmark);
                        }

                    }

                    // Sharing!! addition need to be kids friendly bookmark
                    if (bookmark.iskidFriendlyEligible() && bookmark.getKidFriendlyStatus()
                        .equals(KidFriendlyStatus.APPROVED) && bookmark instanceof Shareable) {

                        boolean isShared = getShareDecision();
                        if (isShared) {

                            BookmarkController.getInstance().share(user, bookmark);
                        }

                    }

                }

            }

        }

    }

    // TODO: Below mthods simulate user input. After IO, we take input via
    // console.
    private static boolean getShareDecision() {
        return Math.random() < 0.5 ? true : false;
    }

    private static String getKidFriendlyStatusDecision(Bookmark bookmark) {
        return Math.random() < 0.4 ? KidFriendlyStatus.APPROVED
            : (Math.random() >= 0.4 && Math.random() < 0.8) ? KidFriendlyStatus.REJECTED
                : KidFriendlyStatus.UNKNOWN;
    }

    private static boolean getBookmarkDecision(Bookmark bookmark) {
        return Math.random() < 0.5 ? true : false;
    }
    /*
     * public static void bookmark(User user, Bookmark[][] bookmarks) {
     * System.out.println("\n" + user.getEmail() + "is bookmarking"); for (int i
     * = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) { int typeOffset = (int)
     * (Math.random() DataStore.BOOKMARK_TYPES_COUNT); // index to get the type
     * int bookmarkOffset = (int) (Math.random()
     * DataStore.BOOKMARK_COUNT_PER_TYPE); // to get the particular bookmark in
     * particular type Bookmark bookmark =
     * bookmarks[typeOffset][bookmarkOffset];
     * BookmarkController.getInstance().saveUserBookmark(user,bookmark);
     * System.out.println(bookmark); } }
     */
}
