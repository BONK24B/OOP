package HW6.Ex4;

public class Square extends Shape{
    private int side;

    public void setSide(int side){
        this.side = side;
    }

    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getHeight() {
        return side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
