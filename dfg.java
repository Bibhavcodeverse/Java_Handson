import java.util.Scanner;

public class dfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // pen =10; notebook =40
    
    int cash = sc.nextInt();
    if(cash<10) {
        System.out.println("Cannot buy anything");
        System.out.println("get more cash");
        
    }
    
    else if(cash>10 && cash<50)  {
        System.out.println("can get 1 things");
    }
    
    else {
        System.out.println("can get both" );
    }
    }
    
}
