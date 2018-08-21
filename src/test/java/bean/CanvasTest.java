package bean;

import org.junit.jupiter.api.Test;
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
    void testDrawLine() {

    }

    @Test
    void testDrawRectangle() {
    }

    @Test
    void testBucketFill() {
    }
}