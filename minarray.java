
import java.util.Scanner;
// Write a program to print the minimum of arraay;


public class minarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the length of array: ");
        int a= sc.nextInt();

        int arr[]=new int[a];
        for (int i=0; i<a; i++){
            System.out.println("Enter"+i+"element of array");
            arr[i]=sc.nextInt();

        }
        int min = arr[0]; // Initialize min to the first element of the array
        
        for (int i = 1; i < a; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("The minimum element in the array is: " + min);
    }


    
}
