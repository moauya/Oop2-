//3
package zoo;


public class Fish {
    private String name;
    private String scaleColor;
    
    public Fish(){
    }
    public Fish(String name, String scaleColor) {
        setName(name);
        setScaleColor(scaleColor);
    }
    
    public void swim(){
        System.out.println("Fish Swimming");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getName() {
        return name;
    }

    public String getScaleColor() {
        return scaleColor;
    }
    
    
}
