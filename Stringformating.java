// public class Stringformating {
//     public static void main(String[] args) {
//         String str1= String.format("%d",101);
//         String str2= String.format("|%10d|",101);
//         String str3= String.format("|%-10d|",101);
//         String str4= String.format("|%d|",101);
//         String str5= String.format("|%10d|",101);
//         System.out.println(str1);
//         System.out.println(str2);
//         System.out.println(str3);
//         System.out.println(str4);

//     }
    
// }

class SortString {
    static String arr[] = {
         "Now", "is", "the", "time", "for", "all", "good",      
         "men", "to", "come", "to", "the", "aid", "of", 
         "their", "country" };
 
    public static void main(String args[]) {
       for(int j = 0; j < arr.length; j++) {
          for(int i = j + 1; i < arr.length; i++) {
             if(arr[i].compareTo(arr[j]) < 0) {
                  String t = arr[j];
                  arr[j] = arr[i];
                  arr[i] = t;
             }
          }
          System.out.println(arr[j]);
       }
    }
 }