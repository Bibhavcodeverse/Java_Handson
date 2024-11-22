import java.io.File;



public class CreateFile {
    public static void main(String[] args){
        try{
            File fo= new File("C:\\Users\\BIBHAV KUMAR\\OneDrive\\Desktop\\Java HandsOn\\StreamIO\\file.txt");
        if(fo.createNewFile()){
            System.out.println("File"+ fo.getName()+"is created successfully");
        }else{
            System.out.println("Already exist");
        }
    }catch(Exception e){}
    }
    
}
