import devices.Camera;
import devices.MusicPlayer;
import devices.Phone;

public class Smarphone implements Camera, Phone, MusicPlayer {

    @Override
    public void playMusic() {

        System.out.println("Playing Music ");
    }

    @Override
    public void StopMusic() {

        System.out.println("Stoping music");
    }

    @Override
    public void makeCall() {

        System.out.println("Calling to Person");
    }

    @Override
    public void endCall() {

        System.out.println(" Call ended");
    }

    @Override
    public void captureImg() {

        System.out.println("Capturing image");

    }

    @Override
    public void saveImg() {

        System.out.println("Saving Image");
    }

}
