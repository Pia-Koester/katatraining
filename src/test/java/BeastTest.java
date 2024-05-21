import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeastTest {

    @Test
    @DisplayName("Check if Beast and dish have matching first and last letters - True")
    void feast() {
        String beastMatch = "Pferde";
        String dish = "Porridge";
        boolean resultTrue = Beast.feast(beastMatch, dish);

        assertTrue(resultTrue);
    }

    @Test
    @DisplayName("Check if Beast and dish have matching first and last letters - False")
    void feastFalse() {
        String beastNoMatch = "Hase";
        String dish = "Porridge";
        boolean resultFalse = Beast.feast(beastNoMatch, dish);
        assertFalse(resultFalse);
    }
}