public class method {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;

    }
    public static void main(String[] args) {
        int z=logic(6,7);
        System.out.println(z);
        
    }
    
}
