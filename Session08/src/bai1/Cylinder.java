package bai1;

public class Cylinder extends  Circle{
   private Double height ;

    public Cylinder(Double radius, String color, Double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double calVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Height : " + height;
    }
}
