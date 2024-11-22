public class cwh_27_arrays {
    public static void main(String[] args) {
        int[] marks = {98,45,79,99,80};
        //float [] f1 ={98.5f,45.5f,79.5f,99.5f,80.5f};
        //String [] students = {"bibhav","ajsfbj","feuig","eigjr"};
        //System.out.println(students[3]);
        //System.out.println(students.length);
        //System.out.println(marks.length);
        //System.out.println(f1[3]);
        // displaying the array (naive way)
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        //System.out.println(marks[3]);
        //System.out.println(marks[4]);
        //System.out.println();
//printing using for loop
       // for(int i=0; i<marks.length;i++){
         //   System.out.println(marks[i]);
       // }

// printing array in reverse loop
        //for(int i = marks.length-1; i>=0;i--){
           // System.out.println(marks[i]);
       // }
  // using fo each loop transverse the element from array;
System.out.println("printng using for - each loop");
  for(int element: marks){
    System.out.println(element);
  }

    }
    
}
