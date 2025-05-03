package day12.oops;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shp = new Shape();
        System.out.println(shp.shapeName);
        shp.draw();

        System.out.println("===========");

        Circle cir = new Circle();
        System.out.println(cir.shapeName);
        cir.draw();


    }
}
