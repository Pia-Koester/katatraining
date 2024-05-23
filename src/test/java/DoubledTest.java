import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubledTest {

    @Test
    @DisplayName("Check if all values of array are doubled")
    void map() {
        int[] inputArray = Doubled.map(new int[]{9, 7, 3});
        int[] expectedResult = {18, 14, 6};
        assertArrayEquals(expectedResult, inputArray);
    }
}