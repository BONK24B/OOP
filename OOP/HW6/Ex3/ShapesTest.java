package HW6.Ex3;

public class ShapesTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Cube cube = new Cube(4);

        System.out.println(circle.area());
        System.out.println(cube.area());
        System.out.println(cube.volume());
    }
}
