public class stringmethod {
    public static void main(String[] args) {
        String name ="Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lowerstring = name.toLowerCase();
        System.out.println(lowerstring);
        String upperstring = name.toUpperCase();
        System.out.println(upperstring);

        String nontrim = "       bibhav        ";
        System.out.println(nontrim);
        String trimed = nontrim.trim();
        System.out.println(trimed);

        System.out.println(name.substring(2));
        System.err.println(name.substring(1,2));
        System.out.println(name.replace('r','p'));
        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("H"));
        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.equals("Harry"));
        

        
    }
    
}
