package dev.umairashraf.BookmarkingApp.entities;
import static org.junit.Assert.*;
import org.junit.Test;
import dev.umairashraf.BookmarkingApp.constants.MovieGenre;
import dev.umairashraf.BookmarkingApp.managers.BookmarkManager;


public class MovieTest {
    @Test
    // Test1
    public void testIskidFriendlyEligible() {
        Movie movie = BookmarkManager.getInstance().createMovie(3000, "", "   Citizen Kane", 1941,
            new String[] { "    Orson Welles,Joseph Cotten" }, new String[] { "    Orson Welles" },
            MovieGenre.CLASSICS, 8.5);
        boolean iskidFriendlyEligible = movie.iskidFriendlyEligible();
        assertFalse("For Horror Genere-isKidFriendlyEligible should return false",
            iskidFriendlyEligible);
        
          movie = BookmarkManager.getInstance().createMovie(3000, "", "   Citizen Kane", 1941,
            new String[] { "    Orson Welles,Joseph Cotten" }, new String[] { "    Orson Welles" },
            MovieGenre.CLASSICS, 8.5);
          iskidFriendlyEligible = movie.iskidFriendlyEligible();
        assertFalse("For THRILLER Genere-isKidFriendlyEligible should return false",
            iskidFriendlyEligible);
    }
    // Test2
    
}
