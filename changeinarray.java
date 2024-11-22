public class changeinarray {
    static void change(int []arr){
        // a=98;
        arr[0]=98;
    }
    public static void main(String[] args) {
        int marks []= {89,78,67,56,34};
        change(marks);
        System.out.println(marks[0]);

    }
    
}
