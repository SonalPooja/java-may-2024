package ClassWork.jun25;

public class Iphone extends AppStore implements AssistiveAI, Calculator, Camera, Computer, MusicPlayer, Phone, VideoGame{
    @Override
    public void calculate() {
        System.out.println("Calculator open in Iphone");
    }

    @Override
    public void takePictures() {
        System.out.println("Taking pictures using Iphone");
    }

    @Override
    public void surfInternet() {
        System.out.println("Surf internet using Iphone");
    }

    @Override
    public void play() {
        System.out.println("Playing music in Iphone");
    }

    @Override
    public void pause() {
        System.out.println("Pause music in Iphone");
    }

    @Override
    public void stop() {
        System.out.println("Stop music in Iphone");
    }

    @Override
    public void makeCalls() {
        System.out.println("Making calls using Iphone");
    }

    @Override
    public void voiceSpeech() {
        System.out.println("Iphone responds with Hey Siri...");
    }
}
