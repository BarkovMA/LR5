package lr5;

public class Circle extends Shape{

    protected double radius;

    public Circle(int x, int y, boolean isFilled, int radius) {
        super.x = x;
        super.y = y;
        super.isFilled = isFilled;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius (double radius){
        this.radius = radius;
    }
}
