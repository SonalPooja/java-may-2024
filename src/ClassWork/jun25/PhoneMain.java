package ClassWork.jun25;

public class PhoneMain {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.takePictures();
        iphone.makeCalls();
        iphone.apps();
        iphone.surfInternet();
        iphone.voiceSpeech();
        System.out.println();

        Samsung samsung = new Samsung();
        samsung.pause();
        samsung.voiceSpeech();
        samsung.makeCalls();
        samsung.takePictures();
        System.out.println();

        GooglePixel gp = new GooglePixel();
        gp.calculate();
        gp.play();
        gp.stop();
        gp.takePictures();

    }
}
