package Assignments.OopsAssignment.AbstractClass;

public class AudioPlayer extends MediaDevice{

    private String songName;
    private String artist;

    public AudioPlayer(String name, String songName, String artist) {
        super(name);
        this.songName = songName;
        this.artist = artist;
    }

    public void play(){
        System.out.println("Playing song: " + songName + " by " + artist);
    }

    @Override
    public void displayDetails() {
        System.out.println("Audio player: " + getName());
        System.out.println("Song: " + songName);
        System.out.println("Artist: " + artist);
    }
}
