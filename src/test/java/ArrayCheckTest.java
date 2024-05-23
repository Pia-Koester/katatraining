import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCheckTest {

    @Test
    @DisplayName("Check if array contains given element. - True")
    void checkTrue() {
        boolean result = ArrayCheck.check(new Object[]{66, 101, 88}, 88);
        assertTrue(result);
    }

    @Test
    @DisplayName("Check if array contains given element. - False")
    void checkFalse() {
        boolean result = ArrayCheck.check(new Object[]{66, 101, 88}, 77);
        assertFalse(result);
    }


}