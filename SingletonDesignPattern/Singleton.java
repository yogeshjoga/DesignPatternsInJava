package SingletonDesignPattern;

public class Singleton {

    /*
     * use singleton class, its save memory
     * only one time created, use multiple times
     * the old reference is used n Number of times
     * lets try to develop this singleton class.....
     */
    
    // private static Singleton instance1 =  new Singleton();
    private static Singleton laySingleton = null;
     private Singleton (){
        // private constructor it wont allow orther classes directly
     }
     public static Singleton getInsSingleton(){
       // return instance1;

       if(laySingleton == null){
        // if we create like if else blocks its okay while excuting threads its effected reCreated objects
        // we are using synchronized class verifying
        laySingleton = new Singleton();

        synchronized(Singleton.class){
            if(laySingleton == null){
                laySingleton = new Singleton();
            }
        }
       }
       return laySingleton;
     }
    
}