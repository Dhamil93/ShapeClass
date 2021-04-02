import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuboidTest{

    Cuboid x = new Cuboid(10, 5, 4);
    @Test
    void testVolume() {
        float result =x.volume();
        float expected = 200;
        assertEquals(expected, result, 0.1);
    }

    @Test
    void testSurfaceArea() {
    }

    @Test
    void testDescription() {
    }
}