import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File("Free Me - NEFFEX.wav");
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(file1);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            String choice = "";
            while (!choice.equals("Q")) {
                System.out.println("Enter your choice\n P = Play , K = Pause , R = Restart clip , Q = Quit");
                choice = scanner.next();
                choice = choice.toUpperCase();
                switch (choice) {
                    case "P":
                        clip.start();
                        break;
                    case "K":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        System.out.println("Goodbye");
                        clip.stop();
                        clip.close();
                        break;
                    default:
                        System.out.println("Enter a valid option");
                }
            }
            System.out.println("See you soon");
            
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }
}
