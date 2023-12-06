//1
package zoo;

public class Zoo {
    public static void performActivity(Object animal){
        if(animal instanceof Bird){
       ((Bird) animal).fly();//explict casting
    }
        else if(animal instanceof Fish){
            ((Fish) animal).swim();
        }
        else if(animal instanceof Mammals){
            ((Mammals) animal).makeNoise();
        }
    }

   
    public static void main(String[] args) {
        
        Bird b1=new Bird();
        b1.setColor("white");
        b1.setName("rio");
        
        Bird b2=new Eagle("rody","black");
        Bird b3=new Penguin("yoro","green");
        ////
        Eagle a=new Eagle("dory","blonde");
        Penguin p=new Penguin("kashmiri","maron");
        ////
        Fish f=new Fish("eren","blue");
        Shark sh=new Shark("mikassa","purpule");
        Goldfish g=new Goldfish("asaad","gold");
        Mammals m=new Mammals("selena","white");
        
        
        performActivity(b1);
        performActivity(b2);
        performActivity(b3);
        performActivity(a);
        performActivity(p);
        performActivity(f);
        performActivity(sh);
        performActivity(g);
        performActivity(m);
      
       
        
    }
    
}
