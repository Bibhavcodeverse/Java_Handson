import java.util.Scanner;
class evenoddchecker{

    public static void evenodd(int num){
    if(num%2==0)
    System.out.println("The given number is even: "+ num);
    else
    System.out.println("the Given number is odd:  "+ num);
    }
}
public class findEvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        

        evenoddchecker eo=new evenoddchecker();
        eo.evenodd(num);
    }
    
}
