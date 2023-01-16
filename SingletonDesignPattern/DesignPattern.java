package SingletonDesignPattern;

public class DesignPattern {
    /*
     * 
     */
    public static void main(String[] args) {
        // for testing purpose these lines
        // default the class address is created differe, the object creation is 2 times.
        // To overCome this we need to create singleton class, if you create n no's objects, it will refelect old objection reference
        Singleton singleton1 = Singleton.getInsSingleton();  // new Singleton();
        Singleton singleton2 =  Singleton.getInsSingleton(); // new Singleton();
        System.out.println("singleton1: "+ singleton1);
        System.out.println("singleton2: "+ singleton2);
        System.out.println(singleton1.equals(singleton2));
    }
}