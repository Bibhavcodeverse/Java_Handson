import java.io.*;

public class fileinformation {
    public static void main (String[] args){
        File f1= new File("Example.txt");

        if(f1.exists()){
            System.out.println("Is file readalble: "+f1.canRead());

            System.out.println("Is file writeable: "+f1.canWrite());

            System.out.println("File name: "+f1.getName());

            System.out.println("File path: "+f1.getAbsolutePath());

            System.out.println("File Size: "+f1.length());


        }

        else{
            System.out.println("The file doesn't exist");
        }
    }
    
}
