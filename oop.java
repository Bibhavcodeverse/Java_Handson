class Employee{
    String name;
    int Id;
     void printdetails(){
        System.out.println("My id is: "+  Id);
        System.out.println("My name is: "+ name);

    }

}


public class oop {
    public static void main(String[] args){
        Employee obj=new Employee();
        Employee obj1= new Employee();

        obj.name="Bibhav";
        obj.Id=100;

        obj1.name="Ram";
        obj1.Id=101;

        obj.printdetails();
        obj1.printdetails();

    }


    
}


