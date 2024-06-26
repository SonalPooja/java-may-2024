package ClassWork.jun25;

public class Ipod implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Playing in Ipod");
    }

    @Override
    public void pause() {
        System.out.println("Pausing in Ipod");
    }

    @Override
    public void stop() {
        System.out.println("Stopping in Ipod");
    }
}
