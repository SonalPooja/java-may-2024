package Assignments.OopsAssignment.AbstractClass;

public class MultiMediaPlayerSystem {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer("Sony NW-A306 Walkman", "Training Season", "Dua Lipa");
        audioPlayer.play();
        audioPlayer.displayDetails();
        System.out.println();

        VideoPlayer videoPlayer = new VideoPlayer("VLC Media Player", "Star Trek", 127);
        videoPlayer.play();
        videoPlayer.displayDetails();
        System.out.println();

        ImageDisplay imageDisplay = new ImageDisplay("Windows Photo Viewer", "Waterfall", "2048×1536");
        imageDisplay.displayImage();
        imageDisplay.displayDetails();
    }
}
