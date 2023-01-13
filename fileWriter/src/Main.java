import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            FileWriter writer= new FileWriter("welcomeMessage.txt");
            writer.write("Hello and welcome. If you know the drill:)");
            writer.close();
        } catch (IOException e) {
            System.out.println("Exception caught\n");
        }
    }
}