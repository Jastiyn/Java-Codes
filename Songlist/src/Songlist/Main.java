package Songlist;
class Song {
    String title;
    String artist;
    Song next;
 
    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
    }
}
 
class Playlist {
    Song head;
 
    void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }
 
    void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        Song current = head;
        System.out.println("Playlist:");
        while (current != null) {
            System.out.println("Title: " + current.title);
            System.out.println("Artist: " + current.artist);
            System.out.println("--------------------");
            current = current.next;
        }
    }
 
    // Function to insert a song at the beginning of the playlist
    void insertAtBeginning(String title, String artist) {
        Song newSong = new Song(title, artist);
        newSong.next = head;
        head = newSong;
    }
 
    // Function to insert a song at the end of the playlist
    void insertAtEnd(String title, String artist) {
        Song newSong = new Song(title, artist);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }
 
    // Function to insert a song after a specified node
    void insertAfterNode(String titleToInsert, String artistToInsert, String titleAfter) {
        Song newSong = new Song(titleToInsert, artistToInsert);
        Song current = head;
 
        while (current != null) {
            if (current.title.equals(titleAfter)) {
                newSong.next = current.next;
                current.next = newSong;
                return;
            }
            current = current.next;
        }
        
 
        System.out.println("Song with title '" + titleAfter + "' not found in the playlist.");
    }
 
    // Function to delete a song by title
    void deleteSong(String titleToDelete) {
        if (head == null) {
            System.out.println("Playlist is empty. Cannot delete.");
            return;
        }
 
        if (head.title.equals(titleToDelete)) {
            head = head.next;
            return;
        }
 
        Song current = head;
        while (current.next != null) {
            if (current.next.title.equals(titleToDelete)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
 
        System.out.println("Song with title '" + titleToDelete + "' not found in the playlist.");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
 
        myPlaylist.addSong("Lowkey", "Niki");
        myPlaylist.addSong("Star ng Pasko", "ABS CBN Artists");
        myPlaylist.addSong("NU Hymn", "Danilo Casil Jr");
        myPlaylist.addSong("Isa Lang", "Daniel Carbonel");
 
        System.out.println("My Playlist:");
        myPlaylist.displayPlaylist();
 
        // Insert a song at the beginning
        myPlaylist.insertAtBeginning("Wrecking Ball", "Miley Cyrus");
 
        // Insert a song at the end
        myPlaylist.insertAtEnd("Billy Jean", "Michael Jackson");
 
        // Insert a song after a specified node
        myPlaylist.insertAfterNode("MPL", "Mami Oni", "NU Hymn");
 
        // Delete a song by title
        myPlaylist.deleteSong("Star ng Pasko");
 
        System.out.println("\nUpdated Playlist:");
        myPlaylist.displayPlaylist();
    }
}
