class A{
    static int x=20;
    int y=30;
    private static int z=40;

    static class B{
        void display1(){
            A obj=new A();
            System.out.println(x+" "+obj.y+" "+z);

        }
    }

}
public class Main {
    public static void main(String[] args){
        A.B obj= new A.B();
        obj.display1();

    }
    
}
