package week05;

public class Rectangle extends Shape implements Printable, Drawable {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea(){
        this.setArea(this.width * this.height);
        return this.getArea();
    }

    @Override
    public void print() {
        System.out.println("I am a rectangle with area of " + this.computeArea());
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
