import com.davismariotti.maventest.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//@Test
class MainTest {

    private static Main main;
    private final static ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeAll
    static void setup() {
        main = new Main();
        System.setOut(new PrintStream(output));
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
    void testNegatives() { // test comment
        int sum = main.addExceptEquals16(-2, -5);
        assertEquals(-7, sum);
    }

    @Test
    void testWithZero() { // test comment
        int sum = main.addExceptEquals16(0, -5);
        assertEquals(-5, sum);
    }

    @Test
    void testEqualsZero() { // test comment
        int sum = main.addExceptEquals16(-5, 5);
        assertEquals(0, sum);
    }

    @Test
    void testMainPrint() {
        Main.main(new String[0]);
        assertEquals("This is a test.\n", output.toString());
    }
}
