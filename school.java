class imployee{
   static String comp_name="TCS";
    int id;
    String employee_name;
    // useing method
    void set_value(String c,int i, String e){
        comp_name=c;
        id=i;
        employee_name=e;
    }

    imployee(int i, String e){
        // comp_name=c;
        id=i;
        employee_name=e;


    }
    void display(){
        System.out.println(comp_name+" "+id+" "+employee_name);

    }
}


public class school {
    public static void main(String[] args) {
        imployee E1=new imployee(101,"bibhav");
        imployee E2=new imployee(1023,"raj");
        // E1.set_value("TCS", 101, "bibhav");
        // E2.set_value("microsoft", 1010, "raj");
        // imployee E3=new imployee();
        // E1.comp_name="TCS";
        // E1.id=101;
        // E1.employee_name="bibhav";
        // E2.comp_name="Microsoft";
        // E2.id=102;
        // E2.employee_name="raj";
        imployee.comp_name="HCL";
        E1.display();
        E2.display();
        // E3.display();
    }
}
