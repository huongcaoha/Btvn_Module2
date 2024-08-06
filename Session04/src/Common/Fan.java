package Common;

import org.w3c.dom.ls.LSOutput;

public class Fan {
    private final int SLOW = 1 ;
    private final int MEDIUM = 2 ;

    private final int FAST = 3 ;
    private int speed = SLOW ;
    private boolean on = false ;
    private double radius = 5 ;
    private String color = "blue" ;

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(on){
            return "Speed : "+ speed + "\n" +
                    "Color : " + color +"\n"+
                    "Radius : " + radius + "\n" +
                    "fan is on" ;

        }else {
            return "Color : " + color + "\n" +
                    "Radius : " + radius + "\n" +
                    "fan is off" ;
        }
    }

    public void map(){
        System.out.println("+---------------+\n" +
                "| Fan     |\n" +
                "+---------------+\n" +
                "-final int SLOW: 1\n" +
                "-final int MEDIUM: 2\n" +
                "-final s: 3\n" +
                "- speed: int\n" +
                "- on : boolean\n" +
                "- radius : double\n" +
                "- color : String \n" +

                "+---------------+\n" +
                "+ Fan()   |\n" +
                "+ toString(): String |\n" +
                "+---------------+");
    }
}
