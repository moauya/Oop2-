
package oop2_week5;


public class singletonClass {
    private static singletonClass instance;
    private String example;

    
    private singletonClass(String example){
        this.example=example;
        System.out.println("the object created");
        
    }
    
    public static singletonClass getInstance(String example){
         if(instance==null){
            instance=new singletonClass(example);
         }
        return instance;
    }

    
    
    
}
