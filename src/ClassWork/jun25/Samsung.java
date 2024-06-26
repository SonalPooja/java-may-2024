package ClassWork.jun25;

public class Samsung extends AppStore implements Camera, MusicPlayer, Phone, AssistiveAI {
    @Override
    public void voiceSpeech() {
        System.out.println("Hey Bixby...");
    }

    @Override
    public void takePictures() {
        System.out.println("Picture taken from samsung.");
    }

    @Override
    public void play() {
        System.out.println("Samsung music player");
    }

    @Override
    public void pause() {
        System.out.println("Music paused in samsung");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped in samsung.");
    }

    @Override
    public void makeCalls() {
        System.out.println("Calls made using samsung phone.");
    }
}
