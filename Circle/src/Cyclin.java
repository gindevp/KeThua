es (25 sloc)  713 Bytes

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color +
                ", area='" + getArea()+
                '\'' +
                '}'+ "which is a subclass of" + super.toString();
    }
}