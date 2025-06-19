package OOPS;

public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Brown");
        System.out.println(p1.getColor());

        p1.setTip(10);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;
    // This is a Getter 
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    // This is a setter
    void setColor(String newColor){
        // When we get a new color in the argument we set it to the value of color
        color = newColor;
    }

    // This is a setter
    void setTip(int newTip){
        tip = newTip;
    }
}