public class diamond {
    interface Shape{
        default void area(){
            System.out.println("Printing the Area");

        }
    }
    interface parallelogram extends Shape{
        int length = 10;
        int breadth = 20;

        default void area(){
            System.out.println("Area is: "+length*breadth);
        }
    }
    interface Rhombus extends parallelogram{
        
    }
}
