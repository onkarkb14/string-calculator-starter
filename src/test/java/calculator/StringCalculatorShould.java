package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
    StringCalculator sc;
    @BeforeEach
    void begin()
    {
        sc=new StringCalculator();
    }
    @Test
    void empty_string_should_return_zero()
    {
        assertEquals(0,sc.add(""));
    }

    @Test
    void empty_string_should_return_0() {

        assertEquals(0, sc.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {

        assertEquals(1, sc.add("1"));
    }
}
