package ch07;

public class Triangle extends Shape{
    /**
     * 三角形的底
     */
    public double bottom;
    /**
     * 三角形的高
     */
    public double height;

    @Override
    public double getArea() {
        return bottom * height / 2;
    }

    @Override
    public double getPerimeter(){
        return 0.0;
    }


}
