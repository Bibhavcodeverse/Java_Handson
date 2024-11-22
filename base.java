class student{
    String name;
    int roll_no;
    student(String n, int r){
        name=n;
        roll_no=r;


    }
    void set_value(String n,int r){
        name=n;
        roll_no=r;
    }
    void display(){
        System.out.println(name+" "+roll_no);

    }
    
    }





public class base {
    public static void main(String[] args){
        student s1=new student("bibhav",120);
        student s2=new student("golu",124);
        // s1.set_value("raj",123);
        // s2.set_value("sonu",456);
        
        s1.display();
        s2.display();

    }
}
