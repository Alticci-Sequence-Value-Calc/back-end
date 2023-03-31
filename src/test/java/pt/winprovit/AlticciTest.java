package pt.winprovit;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

@QuarkusTest
public class AlticciTest {

    @Test
    @DisplayName("Verify alticci sequence value calc")
    public void testAlticciSequenceValueCalc() {
        assertAll(
            "Grouped Assertions that verify alticci sequence value calc", 
                () -> assertEquals(0, Alticci.a(0), "if n=0 then a(n) = 0"),
                () -> assertEquals(1, Alticci.a(1), "if n=1 then a(n) = 1"),
                () -> assertEquals(1, Alticci.a(2), "if n=2 then a(n) = 1"),
                () -> assertEquals(1, Alticci.a(3), "if n=3 then a(n) = 1"),
                () -> assertEquals(2, Alticci.a(4), "if n=3 then a(n) = 2"),
                () -> assertEquals(2, Alticci.a(5), "if n=3 then a(n) = 2"),
                () -> assertEquals(3, Alticci.a(6), "if n=3 then a(n) = 3"),
                () -> assertEquals(4, Alticci.a(7), "if n=3 then a(n) = 4"),
                () -> assertEquals(5, Alticci.a(8), "if n=3 then a(n) = 5"),
                () -> assertEquals(7, Alticci.a(9), "if n=3 then a(n) = 7"),
                () -> assertEquals(9, Alticci.a(10), "if n=3 then a(n) = 9")
        );
    }
}