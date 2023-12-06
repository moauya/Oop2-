//5
package zoo;

public class Penguin extends Bird {

    public Penguin() {
    }
    

    public Penguin(String name, String color) {
        super(name, color);
    }
    
    public void fly(){
        System.out.println("Penguin cannot fly");
    }
    
    
}
