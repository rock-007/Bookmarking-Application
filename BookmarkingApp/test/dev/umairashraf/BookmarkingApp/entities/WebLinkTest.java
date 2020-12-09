package dev.umairashraf.BookmarkingApp.entities;


import static org.junit.Assert.*;
import org.junit.Test;
import dev.umairashraf.BookmarkingApp.managers.BookmarkManager;


public class WebLinkTest {
    @Test
    public void testIskidFriendlyEligible() {
        // Test 1 porn in url -- false
        WebLink weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger",
            "Part 2 http://www.javaworld.com/article/2072759/core-java/taming-tiger-porn-part-2.html",
            "   http://www.javaworld.com");
        boolean isKidFriendlyEligible = weblink.iskidFriendlyEligible();
        assertFalse("For porn in url-isKidFriendlyEligible() must return false",
            isKidFriendlyEligible);
        // Test 2 porn in title -- false
        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn",
            "Part 2 http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
            "   http://www.javaworld.com");
        isKidFriendlyEligible = weblink.iskidFriendlyEligible();
        assertFalse("For porn in title-isKidFriendlyEligible() must return false",
            isKidFriendlyEligible);
        // Test 3 adult in host -- false
        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger",
            "Part 2 http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
            "   http://www.adult.com");
        isKidFriendlyEligible = weblink.iskidFriendlyEligible();
        assertFalse("For adult in host-isKidFriendlyEligible() must return false",
            isKidFriendlyEligible);
        // Test 4 dault in url,but not in host part -- true
        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger",
            "Part 2 http://www.javaworld.com/article/2072759/core-java/taming-tiger-adult-part-2.html",
            "   http://www.javaworld.com");
        isKidFriendlyEligible = weblink.iskidFriendlyEligible();
        assertTrue("For adult in url but not in host-isKidFriendlyEligible() must return true",
            isKidFriendlyEligible);
        // Test 5 adult in title only -- true
        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult",
            "Part 2 http://www.javaworld.com/article/2072759/core-java/taming-tiger-adult-part-2.html",
            "   http://www.javaworld.com");
        isKidFriendlyEligible = weblink.iskidFriendlyEligible();
        assertTrue("For adult in title-isKidFriendlyEligible() must return true",
            isKidFriendlyEligible);
    }
}
