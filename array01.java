public class array01 {
    public static void main(String[] args) {
        // int [] arr1=new int[5];
        // arr1[0]=2;
        // arr1[1]=3;
        // arr1[2]=4;
        // arr1[3]=6;
        // arr1[4]=7;
        // for(int i=0;i<=4;i++)
        // System.out.println(arr1[i]);

        // 2-D array

        int [][] arr2=new int[2][3];
        arr2[0][0]=1;
        arr2[0][1]=2;
        arr2[0][2]=3;
        arr2[1][0]=10;
        arr2[1][1]=20;
        arr2[1][2]=100;

        for (int i=0;i<=1;i++){
            for(int j=0;j<=2;j++)
            System.out.print(arr2[i][j]+ " ");
         System.out.print('\n'); 
        }
        


    }
}
