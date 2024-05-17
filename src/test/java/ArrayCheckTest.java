import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayCheckTest {

    @Test
    void check() {
        boolean result = ArrayCheck.check(new Object[]{66, 101, 88}, 88);

        assertTrue(result);
    }

    // TODO: Add a test that checks that the number 77 is not an element of the Array {66, 101, 88}
}