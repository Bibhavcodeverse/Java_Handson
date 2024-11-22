class students{
    private int rollno;
    private String name;
    static int b=6;

    students(int rollno,String name){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println(this.ame+" "+ this.rollno);
    }

}





class func1 {
    static int a=10;
    int c=1;
    func1(){
        a++;
    }
   
    static void add(int a, int b){
        int c;
        c=a+b;
        System.out.println("Sum: "+c);
    }
    static int add1(int a, int b){
        int c;
        c=a+b;
        System.out.println("Sum: "+c);
        return c;
    }
    

    public static void main(String[] args) {
        // func1 obj=new func1();
        func1 f=new func1();
        System.out.println(a);
        func1 g=new func1();
        System.out.println(a);
        
        System.out.println(f.c);

        System.out.println(g.c);


      //  System.out.println(students.b);

        // //add(4,5);
        // int d=15;
        // int r=add1(4,5);
        // int res= d - r;
        // System.out.println(res);
        students s2;
        students s1=new students();
        s1.display();
        // s1.name="vivek";

        // System.out.println(s1.rollno +" "+ s1.name);
    }
}
