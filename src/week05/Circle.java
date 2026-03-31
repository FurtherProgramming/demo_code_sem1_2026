package week05;

public class Circle extends Shape{
    private double radius;
    @Override
    public double computeArea() {
        this.setArea(this.radius * this.radius * 0.5 * Math.PI);
        return this.getArea();
    }
}
