package Assignments.OopsAssignment.AbstractClass;

public class VideoPlayer extends MediaDevice{

    private String videoTitle;
    private int duration;

    public VideoPlayer(String name, String videoTitle, int duration) {
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    public void play(){
        System.out.println("Playing video: " + videoTitle + " (" + duration + " minutes)");
    }

    @Override
    public void displayDetails() {
        System.out.println("Video player: " + getName());
        System.out.println("Video title: " + videoTitle);
        System.out.println("Duration: " + duration + " minutes");
    }
}
