class calculator1{
    public int multiplication(int n1,int n2){
        int p1;
        int p2;
        int result=n1*n2;
        return result;


    }
}
public class useofcreatingobject {
    public static void main(String [] args){
        calculator1 cal1= new calculator1();
        int r1=cal1.multiplication(6, 7);

        System.out.println(r1);


    }
    
}
