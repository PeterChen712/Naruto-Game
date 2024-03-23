import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class AudioFile {

    public static void Audio(String audioPath) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        File file = new File(audioPath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }

    public static void AudioSorted(String audioPath) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        File file = new File(audioPath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength() / 1000);
    }
}
