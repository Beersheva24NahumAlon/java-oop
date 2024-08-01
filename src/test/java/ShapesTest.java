import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Square;

public class ShapesTest {
    @Test
    void ShapeTest() {
        Canvas canvas = new Canvas();
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(10);
        Canvas subCanvas = new Canvas();
        subCanvas.addShape(rectangle);
        subCanvas.addShape(square);
        canvas.addShape(subCanvas);
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(200, canvas.perimiter());
        assertEquals(600, canvas.square());
    }
}

