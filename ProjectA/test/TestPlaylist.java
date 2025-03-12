package ProjectA.test; // Ensure the package matches where your test files are located

import ProjectA.Playlist; // Import the Playlist class
import ProjectA.Song; // Import the Song class
import org.junit.jupiter.api.Test; // JUnit Test import
import static org.junit.jupiter.api.Assertions.*; // Import assertions for testing

public class TestPlaylist {

    @Test
    public void testAddSong() {
        Playlist playlist = new Playlist();
        playlist.addSong("Blinding Lights", "The Weeknd", 4744556839L);
        assertEquals(1, playlist.getSongs().size()); // Ensure one song is added
        assertEquals("Blinding Lights", playlist.getSongs().get(0).getTitle());
    }

    @Test
    public void testRemoveSong() {
        Playlist playlist = new Playlist();
        playlist.addSong("Blinding Lights", "The Weeknd", 4744556839L);
        playlist.removeSong("Blinding Lights");
        assertTrue(playlist.getSongs().isEmpty()); // Playlist should be empty
    }

    @Test
    public void testFilterSongsByPlayCount() {
        Playlist playlist = new Playlist();
        playlist.addSong("Blinding Lights", "The Weeknd", 4744556839L);
        playlist.addSong("Shape of You", "Ed Sheeran", 4256158591L);

        long minPlays = 4300000000L; // Filter by play count greater than this
        assertEquals(1, playlist.getSongs().stream()
                .filter(song -> song.getPlayCount() > minPlays).count());
    }

    @Test
    public void testPlaylistEmpty() {
        Playlist playlist = new Playlist();
        assertTrue(playlist.getSongs().isEmpty()); // Playlist should initially be empty
    }
}

