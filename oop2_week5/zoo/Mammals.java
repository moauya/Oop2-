//8
package zoo;


public class Mammals {
    private String name;
    private String color;

    public Mammals() {
    }

    
    public Mammals(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void makeNoise(){
        System.out.println("the mammals make noise");
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
