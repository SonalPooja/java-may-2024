package ClassWork.jun25;

public class GooglePixel implements Camera, Calculator, MusicPlayer{
    @Override
    public void calculate() {
        System.out.println("Using google pixel phone calculator");
    }

    @Override
    public void takePictures() {
        System.out.println("Pictures taken using google pixel phone.");
    }

    @Override
    public void play() {
        System.out.println("Music playing in google pixel phone");
    }

    @Override
    public void pause() {
        System.out.println("Music paused in google pixel phone");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped in google pixel phone");
    }
}
