package ProjectA.test;

import ProjectA.Song;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        song.play();
        assertEquals(5001, song.getPlayCount());
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
        song.setPlayCount(-100); // Attempt to set a negative play count
        assertEquals(5000, song.getPlayCount()); // Play count should remain unchanged
    }
}
