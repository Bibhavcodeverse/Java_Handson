// Define the package (if needed) or remove if it's not necessary


public class w1 {

    // Define an interface named 'Student'
    interface Student {
        int Id = 0;        // Default value for Id
        String name = "";  // Default value for name

        // Abstract method marks() to be implemented by classes
        void marks();
    }

    // Define a class 'MCA' that implements the 'Student' interface
    class MCA implements Student {
        @Override
        public void marks() {
            System.out.println("Marks are above 80");
        }
    }

    // Define a class 'BCA' that implements the 'Student' interface
    class BCA implements Student {
        @Override
        public void marks() {
            System.out.println("Marks are less than 80");
        }
    }

    // Define a class 'Grade' which uses MCA and BCA instances
    class Grade {
        public void gradeStudents() {
            MCA obj1 = new MCA();
            BCA obj2 = new BCA();

            obj1.marks();
            obj2.marks();
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        w1 outerClass = new w1();  // Create an instance of the outer class to access inner classes
        Grade g = outerClass.new Grade();
        g.gradeStudents();  // Call the method to display marks
    }

}




