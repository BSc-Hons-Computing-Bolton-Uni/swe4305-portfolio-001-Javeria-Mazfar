package ProjectA;

import java.util.ArrayList;
import java.util.List;

// This class manages a list of songs and provides operations like adding, removing and listing songs
public class Playlist {
    private List<Song> songs;

    // Constructor initializes the playlist as an empty list
    public Playlist() {
        songs = new ArrayList<>();
    }

    // Getter for the list of songs
    public List<Song> getSongs() {
        return songs;
    }

    // Setter for the list of songs
    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    // Method to add a song to the playlist
    public void addSong(String title, String artist, long playCount) {
        songs.add(new Song(title, artist, playCount));
    }

    // Method to remove a song by its title with feedback
    public void removeSong(String title) {
        boolean removed = songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Song '" + title + "' removed successfully.");
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    // Method to print all songs in the playlist
    public void printAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist.");
        } else {
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }

    // Method to filter songs by play count
    public void filterSongsByPlayCount(long minPlays) {
        boolean found = false;
        for (Song song : songs) {
            if (song.getPlayCount() > minPlays) {
                System.out.println(song);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No songs found with more than " + minPlays + " plays.");
        }
    }
}


