package TmasPraktika;

public class Main {
    public static void main(String[] args) {

        Shape shape;
        shape = new Circle();
        shape.draw();
        shape.erase();
        System.out.println();

        shape = new Square();
        shape.draw();
        shape.erase();
        System.out.println();

        shape = new Trangle();
        shape.draw();
        shape.erase();

    }
}
