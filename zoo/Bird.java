//2
package zoo;


public class Bird {
    private String name;
    private String color;

    public Bird() {
    }
    

    public Bird(String name, String color) {
        setName(name);
        setColor(color);
    }
    
    public void fly(){
        System.out.println("Bird flying ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
