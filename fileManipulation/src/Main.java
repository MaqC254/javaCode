import java.io.File;

public class Main {
    public static void main(String[] args) {
        //This project is to use File class to know if a document exists and its full path
        File file1=new File("sim.txt");
        boolean exists=file1.exists();
        if(exists=true){
            System.out.println("This document exists");
            System.out.println("The absolute path for the file is "+file1.getAbsolutePath());
        }
        else{
            System.out.println("This document does not exist");
        }
    }
}