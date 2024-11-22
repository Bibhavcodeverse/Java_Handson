
    class MyEmployee{
        private int id;
        private String name;


        public void setName(String n){
            this.name =n;
        
        
        }
        public String getName(){
            return name;
        }

        public void setId(int i){
            this.id =i;

        }

        public int getId(){
            return id;
        }
    }
        public class useofacessmodifier {
        public static void main(String[] args) {
            MyEmployee bibhav= new MyEmployee();
            MyEmployee batch= new MyEmployee();
            bibhav.setName("CodeWithBibhav");
            System.out.println(bibhav.getName());
            batch.setId(1001);
            System.out.println(batch.getId());

            

        }
    }
    

