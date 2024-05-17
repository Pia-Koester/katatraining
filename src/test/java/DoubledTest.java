import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubledTest {

    @Test
    void map() {
        int[] inputArray = Doubled.map(new int[]{9, 7, 3});
        assertArrayEquals(new int[]{18, 14, 6}, inputArray, "The array should be doubled");
    }
}