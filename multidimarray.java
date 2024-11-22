public class multidimarray {
    
        public static void main(String[] args) {
            // Initialize the array inside the main method
            int[][] num = {{1, 2}, {3, 4}, {5, 6}};
            
            // Print the array elements
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }
    
    

