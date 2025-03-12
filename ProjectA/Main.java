package ProjectA;

import java.util.Scanner;

// This class handles user interaction and runs the application
public class Main {
    public void run() {
        System.out.println("Running Music Streaming Application...");
        main(new String[]{}); // Call the main method
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

// Adding sample data to the playlist
// Use long data type for play count as these numbers are large
        playlist.addSong("Blinding Lights", "The Weeknd", 4744556839L);
        playlist.addSong("Shape of You", "Ed Sheeran", 4256158591L);
        playlist.addSong("Someone You Loved", "Lewis Capaldi", 3827854595L);
        playlist.addSong("As It Was", "Harry Styles", 3790042649L);
        playlist.addSong("Starboy", "The Weeknd", 3786261291L);
        playlist.addSong("Sunflower", "Post Malone", 3736621487L);
        playlist.addSong("Sweater Weather", "The Neighbourhood", 3628066507L);
        playlist.addSong("One Dance", "Drake", 3556792080L);
        playlist.addSong("STAY", "The Kid LAROI", 3489690403L);
        playlist.addSong("Believer", "Imagine Dragons", 3354104392L);
        playlist.addSong("Perfect", "Ed Sheeran", 3331163054L);
        playlist.addSong("Heat Waves", "Glass Animals", 3314430460L);
        playlist.addSong("lovely", "Billie Eilish", 3227622580L);
        playlist.addSong("Dance Monkey", "Tones And I", 3226522970L);
        playlist.addSong("Say You Won't Let Go", "James Arthur", 3187668117L);
        playlist.addSong("Closer", "The Chainsmokers", 3180481626L);
        playlist.addSong("rockstar", "Post Malone", 3135127761L);
        playlist.addSong("Something Just Like This", "The Chainsmokers", 3052547996L);
        playlist.addSong("Riptide", "Vance Joy", 3000461043L);
        playlist.addSong("Watermelon Sugar", "Harry Styles", 2955360197L);
        playlist.addSong("Señorita", "Shawn Mendes", 2952935375L);
        playlist.addSong("Take Me to Church", "Hozier", 2936498589L);
        playlist.addSong("Another Love", "Tom Odell", 2921345695L);
        playlist.addSong("I Wanna Be Yours", "Arctic Monkeys", 2888596474L);
        playlist.addSong("Yellow", "Coldplay", 2883575566L);

        // Display menu for user interaction
        while (true) {
            System.out.println("\nMusic Streaming Application:");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all songs");
            System.out.println("4. Filter songs with play count over a given number");
            System.out.println("5. Play a song");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter song title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter artist name: ");
                        String artist = scanner.nextLine();
                        System.out.print("Enter play count: ");
                        long playCount = scanner.nextLong();
                        playlist.addSong(title, artist, playCount);
                        System.out.println("Song added successfully.");
                        break;

                    case 2:
                        System.out.print("Enter song title to remove: ");
                        title = scanner.nextLine();
                        playlist.removeSong(title);
                        break;

                    case 3:
                        System.out.println("\nAll Songs:");
                        playlist.printAllSongs();
                        break;

                    case 4:
                        System.out.print("Enter minimum play count: ");
                        long minPlays = scanner.nextLong();
                        System.out.println("\nSongs with more than " + minPlays + " plays:");
                        playlist.filterSongsByPlayCount(minPlays);
                        break;

                    case 5:
                        System.out.print("Enter song title to play: ");
                        title = scanner.nextLine();
                        Song songToPlay = playlist.getSongs().stream()
                                .filter(song -> song.getTitle().equalsIgnoreCase(title))
                                .findFirst()
                                .orElse(null);
                        if (songToPlay != null) {
                            songToPlay.play();
                        } else {
                            System.out.println("Song not found in the playlist.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting the application. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}
