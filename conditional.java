
import java.util.Scanner;
public class conditional {
    public static void main(String[] args){
        // int age=7;
        // if(age>18){
        //     System.out.println("Yes boy you can drive!");

        // }
        // else{
        //     System.out.println("No boy you cant drive yet!");
        // }
        System.out.println("enter your age ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch (age) {
            case 17:
                System.out.println("You re going to become an Adult: ");
                
                break;
        
            case 20:
                System.out.println("You are going to join a Job");

                break;

            case 30:
                System.out.println("You are going to be exprensive");

                break;
        }
    }
}
