class Calculator{
    public int Add(int num1, int num2){
       int result = num1+num2;
       return result;
       
    
    }
    
    
    
}
public class Demo{

  
    public static void main(String[] args){
        int n1=5;
        int n2=6;

        Calculator cal= new Calculator();
        int r= cal.Add(5,6);
        System.out.println(r);

        

        

    }
    
}

    

