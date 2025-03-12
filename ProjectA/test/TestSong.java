package ProjectA.test; // Ensure the package matches where your test files are located

import ProjectA.Song; // Import the Song class
import org.junit.jupiter.api.Test; // JUnit Test import
import static org.junit.jupiter.api.Assertions.*; // Import assertions for testing

public class TestSong {

    @Test
    public void testSongCreation() {
        Song song = new Song("Shape of You", "Ed Sheeran", 1000);
        assertEquals("Shape of You", song.getTitle());
        assertEquals("Ed Sheeran", song.getArtist());
        assertEquals(1000, song.getPlayCount());
    }

    @Test
    public void testPlayMethod() {
        Song song = new Song("Blinding Lights", "The Weeknd", 5000);
        song.play(); // Simulate playing the song
        assertEquals(5001, song.getPlayCount()); // Play count should increment by 1
    }

    @Test
    public void testSetPlayCount() {
        Song song = new Song("Lovely", "Billie Eilish", 3000);
        song.setPlayCount(4000);
        assertEquals(4000, song.getPlayCount());
    }

    @Test
    public void testSetNegativePlayCount() {
        Song song = new Song("Sunflower", "Post Malone", 5000);
        song.setPlayCount(-10); // Invalid play count
        assertEquals(5000, song.getPlayCount()); // Play count should remain unchanged
    }
}

