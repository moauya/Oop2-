//10
package zoo;


public class Cow extends Mammals{

    public Cow() {
    }
    

    public Cow(String name, String color) {
        super(name, color);
    }
    public void makeNoise(){
        System.out.println("the cow says : mooo");
    }
    
}
