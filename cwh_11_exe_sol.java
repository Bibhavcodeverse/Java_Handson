import java.util.Scanner;

public class cwh_11_exe_sol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks :");
        int physics =scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int Chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks :");
        int Mathematics = scan.nextInt();
        System.out.println("Enter your Computer science   :");
        int Computer =scan.nextInt();
        
        float percentage = ((physics + English + Chemistry + Mathematics + Computer)/500.0f)*100;
        System.out.println("percentage: ");
        System.out.println(percentage);
    
    }
}
