package creational.singleton;


public class SingletonPattern {
    
    

    public static void main(String args[]) {


        // Eager instantiation
        EagerInstantiation eagerInstance = EagerInstantiation.getInstance();
        System.out.println(eagerInstance.getType());


        
    }

    

}
