class Mobile{
    String brand;
    int price;
    static String name;
    
    public void show(){
        System.out.println(brand+":"+price+":"+name);   

    }
    public static void show1(Mobile mb5){   
        System.out.println(mb5.brand+":"+mb5.price+":"+":"+name);

    }//when the variable is not static we can't acces it in the static method directly but by giving reference of object we can access it.
}
    public class practicestatickey {
    public static void main(String[] args){
        Mobile mb=new Mobile();

        mb.brand="Samsung";
        mb.price=10000;
        Mobile.name="Smartphone"; 

        Mobile mb1=new Mobile();

        mb1.brand="vivo";
        mb1.price=20000;
        Mobile.name="phone";       // Static variable must called by class name.
        //once static variable value  change  then it also updatev the value of previous variable value.

        Mobile mb5=new Mobile();
        mb5.brand="lenvo";
        mb5.price=50000;
        Mobile.name="Smartphone";

        mb.show(); 
        mb1.show();
        Mobile.show1(mb5);

    }
    }
