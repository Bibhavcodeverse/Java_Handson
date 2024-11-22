import java.util.Scanner;

public class table {

    // static void multiplication(int num){
    //     for(int i=1;i<=10;i++){
    //         System.out.format("%d*%d=%d\n",num,i,num*i);
    //     }
    
    // }

    static void pattern1(int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<i+1;j++){
                System.out.println("*");
            }
            System.out.println();
            }
            
        }


    

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Multiplication table of number: ");
        // int num=sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();


        
        // table.multiplication(num);
       table.pattern1(r);
    }   
    
}
