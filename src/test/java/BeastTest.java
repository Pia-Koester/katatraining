import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeastTest {

    @Test
    void feast() {
        //@Max ist es besser hier zwei Tests draus zu machen für richtig und falsch?fs

        String beastMatch = "Pferde";
        String beastNoMatch = "Hase";
        String dish = "Porridge";
        boolean resultTrue = Beast.feast(beastMatch, dish);
        boolean resultFalse = Beast.feast(beastNoMatch, dish);

        assertTrue(resultTrue);
        assertFalse(resultFalse);
    }
}