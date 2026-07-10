package TmasPraktika;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("I draw Circle");
    }

    @Override
    public void erase() {
        System.out.println("I erase Circle");
    }
}
