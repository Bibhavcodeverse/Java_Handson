class dog{
    void eat(){
        System.out.println("He is eating");
    }
}
class cat extends dog{
    void meow(){
        System.out.println("She is meowing");
    }
}
class animal extends cat{
    void feature(){
        System.out.println("Both are animal ");

    }
}

public class multilvelinheritence {
    public static void main(String[] args){
        animal a= new animal();
        a.feature();
        a.meow();
        a.eat();
    }

    
}
