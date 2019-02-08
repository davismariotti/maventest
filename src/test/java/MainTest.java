import com.davismariotti.maventest.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//@Test
class MainTest {

    private static Main main;

    @BeforeAll
    static void setup() {
        main = new Main();
    }

    @Test
    void testMainNormal() {
        int sum = main.addExceptEquals16(2, 2);
        assertEquals(4, sum);

    }

    @Test
    void testMain16() {
        assertThrows(RuntimeException.class, () -> main.addExceptEquals16(8, 8));
    }

    @Test
    void testNegatives() {
        int sum = main.addExceptEquals16(-2, -5);
        assertEquals(-7, sum);
    }
}
