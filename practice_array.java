public class practice_array {
    public static void main(String[] args) {
       /*float [] marks= {44.5f,44.6f,23.4f,45.6f,78.9f,56.2f,87.3f};
       float sum =0;
         sum = sum+element;


       }
System.out.println("The vALUE of sumis "+sum);
    }*/
    /*float [] marks= {44.5f,44.6f,23.4f,45.6f,78.9f,56.2f,87.3f};
    float num = 45.6f;
    boolean isInArray= false;
    for (float element: marks ){
        if(num==element){
            isInArray=true;
            break;
        }
        

    }

    if(isInArray){
        System.out.println("The value is present in the array");

    }
    else{
        System.out.println("The value is not present in the array ");
    }*/

    /*float [] Physics= {44.5f,44.6f,23.4f,45.6f,78.9f,56.2f,87.3f};
    float sum = 0;

    for(float element : Physics){
        sum=sum+element;
        //float total_student= 7;
        




    }
    float average_marks = (sum/Physics.length);
    System.out.println("The sum is" +sum);
    System.out.println("The average marks of all students" + average_marks);


}*/

int [] [] multi;
multi = new int [2][3];
multi[0][0]=100;
multi[0][1]=200;
multi[0][2]=300;
multi[1][1]=400;
multi[1][2]=500;
multi[1][3]=600;

System.out.println("Printing a 2-D array using for loop");
        for (int i=0;i<multi.length;i++){
            for(int j=0; j<multi[i].length;j++){
                System.out.print(multi[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }




int [] [] bibhav;
bibhav = new int [2][3];
bibhav[0][0]=100;
bibhav[0][1]=200;
bibhav[0][2]=300;
bibhav[1][1]=400;
bibhav[1][2]=500;
bibhav[1][3]=600;


System.out.println("Printing a 2-D array using for loop");
        for (int i=0;i<bibhav.length;i++){
            for(int j=0; j<bibhav[i].length;j++){
                System.out.print(bibhav[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }



}
}
