package lr5;

public abstract class Shape {

    public int x;
    public int y;
    public boolean isFilled;

    void setPosition(int x, int y, boolean isFilled){
        this.x = x;
        this.y = y;
        this.isFilled = isFilled;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }
}
