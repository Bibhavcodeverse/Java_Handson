import java.io.*;

public class WriteINFiledemo {
    public static void main(String[] args){
        String College=" College walle ne jindgi barbad krr rkhe hai";
        String path="file.txt";

        try(
            FileWriter f= new FileWriter(path)){
            f.write(College);
            System.out.println("Data successfully written in file");

        }
        catch(IOException e){            
            e.printStackTrace();        
   

        }



        

    }
    
}
