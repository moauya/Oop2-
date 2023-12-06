//7
package zoo;

public class Goldfish extends Fish {

    public Goldfish() {
    }

    public Goldfish(String name, String scaleColor) {
        super(name, scaleColor);
    }
    
    public void swim(){
        System.out.println("Gold fish swimming in the bowl");
    }
    
}
