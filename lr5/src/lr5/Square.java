package lr5;

public class Square extends Shape{

    public double side;

    public Square(int x, int y, boolean isFilled, int side) {
        super.x = x;
        super.y = y;
        super.isFilled = isFilled;
        this.side = side;

    }

    public double getSide(){
        return side;
    }

    public void setSide (double side){
        this.side = side;
    }

}

