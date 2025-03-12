package ProjectA;

// This class represents a Song object with attributes: title, artist, and play count
public class Song {
    private String title;
    private String artist;
    private long playCount; // Updated to long to handle large numbers

    // Constructor to initialize the Song object
    public Song(String title, String artist, long playCount) {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    // Getter for the song title
    public String getTitle() {
        return title;
    }

    // Setter for the song title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for the artist name
    public String getArtist() {
        return artist;
    }

    // Setter for the artist name
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Getter for the play count
    public long getPlayCount() {
        return playCount;
    }

    // Setter for the play count with validation
    public void setPlayCount(long playCount) {
        if (playCount < 0) {
            System.out.println("Play count cannot be negative.");
            return;
        }
        this.playCount = playCount;
    }

    // Play method to simulate playing a song and increment play count
    public void play() {
        System.out.println("Playing: " + title + " by " + artist);
        playCount++;
    }

    // Method to display song details
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Play Count: " + playCount;
    }
}



