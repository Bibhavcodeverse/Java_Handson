public class swap1 {
    public static void main(String[] args) {
        int a=9;
        int b=10;
        
        swap( a, b);
        // int c=5;
        // int d=7;

        // a= a+b;
        // b=a-b;
        // a=a-b;
        // c=c+d;
        // d=c-d;
        // c=c-d;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);



    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    
}
