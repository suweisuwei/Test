package ch07;

public class Rectangle extends Quads {

    public double height;
    public double width;
    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        return 0.0;
    }


    public static void main(String[] args) {
        Shape square = new Rectangle();
        Shape aTriangle = new Triangle();
        getShapeHeight(aTriangle);
        getShapeHeight(square);
        square = aTriangle;
        System.out.println(square.getClass());


    }

    public static double getShapeHeight(Shape shape) {
        if(shape instanceof Triangle) {
            return ((Triangle) shape).height;
        }else if(shape instanceof Rectangle) {
            return ((Rectangle)shape).width;
        }else {
            return -1;
        }
    }

    public static double getTriangleHeight(Triangle tri) {
        return tri.height;
    }
    public static double getRectHeight(Rectangle rect) {
        return rect.width;
    }
}
