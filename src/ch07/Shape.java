package ch07;

public abstract class Shape {
    /**
     * 形状的面积
     */
    public double area;
    /**
     * 形状的周长
     */
    public double perimeter;

    public abstract double getArea();

    public abstract double getPerimeter();
}
