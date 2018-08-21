package bean;

import exception.CanvasException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CanvasTest {

    @Test
    void testConstructor() {
        Canvas canvas  = new Canvas(20, 4);
        assertEquals(canvas.render(),
        "----------------------\n" +
        "|                    |\n" +
        "|                    |\n" +
        "|                    |\n" +
        "|                    |\n" +
        "----------------------");
    }

    @Test
    void testConstructorException() {
        Executable closureContainingCodeToTest = () -> new Canvas(0, 4);
        assertThrows(CanvasException.class, closureContainingCodeToTest, "");
    }

    @Test
    void testDrawLine() {

    }

    @Test
    void testDrawRectangle() {
    }

    @Test
    void testBucketFill() {
    }
}