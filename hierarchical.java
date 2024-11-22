class MCA {
    void subject(){
        System.out.println("AIML,Data Science,Cyber");

    }
}
class AIML extends MCA{
    void SpecializationAIML(){
        System.out.println("His Specialization is AIML");
    }
}
class DataScience extends MCA{
    void SpecializationDataScience(){
        System.out.println("His specialization is DataScience");
    }

}


public class hierarchical {
    public static void main(String[] args){
        DataScience ds=new DataScience();
        ds.SpecializationDataScience();
       // ds.SpecializationAIML();
        ds. subject();
    }
    
}
