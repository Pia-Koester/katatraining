import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceTest {

    @Test
    @DisplayName("All spaces should be removed from String")
    void noSpace() {
        String input = Space.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B");
        String expectedResult = "8j8mBliB8gimjB8B8jlB";
        assertEquals(expectedResult, input);
    }
}