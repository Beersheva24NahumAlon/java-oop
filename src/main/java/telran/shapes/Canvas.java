package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape {
    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimeter() {
        int res = 0;
        for (Shape shape : shapes) {
            res += shape.perimeter();
        }
        return res;
    }

    @Override
    public int square() {
        int res = 0;
        for (Shape shape : shapes) {
            res += shape.square();
        }
        return res;
    }
}
