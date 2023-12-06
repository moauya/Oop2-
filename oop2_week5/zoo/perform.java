
package zoo;


public class perform {
    public static void performActivity(Object animal){
        if(animal instanceof Bird){
            ((Bird) animal).fly();
        }
        else if(animal instanceof Fish){
            ((Fish) animal).swim();
        }
        else if(animal instanceof Mammals){
            ((Mammals) animal).makeNoise();
        }
    }
    
}
