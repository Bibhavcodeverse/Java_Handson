class animal{
    void eat(){
        System.out.println("He is eating.");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("He is barking");
    }
}



public class singleinhertence {
    public static void main(String[] args){
        dog d= new dog();
        d.bark();
        d.eat();
    }
    
}
