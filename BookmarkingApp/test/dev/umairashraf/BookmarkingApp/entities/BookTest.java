package dev.umairashraf.BookmarkingApp.entities;


import static org.junit.Assert.*;
import org.junit.Test;
import dev.umairashraf.BookmarkingApp.constants.BookGenre;
import dev.umairashraf.BookmarkingApp.managers.BookmarkManager;


public class BookTest {
    @Test
    public void testIskidFriendlyEligible() {
        Book book = BookmarkManager.getInstance().createBook(4000, "   Walden", 1854,
            "    Wilder Publications", new String[] { "Henry David Thoreau" },
            BookGenre.PHILOSOPHY, 4.3);
        boolean iskidFriendlyEligible = book.iskidFriendlyEligible();
        assertFalse("For PHILOSOPHY Genre  -isKidFriendlyEligible should return false",
            iskidFriendlyEligible);
        book = BookmarkManager.getInstance().createBook(4000, "   Walden", 1854,
            "    Wilder Publications", new String[] { "Henry David Thoreau" },
            BookGenre.SELF_HELP, 4.3);
        iskidFriendlyEligible = book.iskidFriendlyEligible();
        assertFalse("For Self Help Genre  -isKidFriendlyEligible should return false",
            iskidFriendlyEligible);
    }
}
