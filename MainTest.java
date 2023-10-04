import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void checkFindMax(){
        assertEquals(10, Main.findMax(4, 7, 10));
    }
}