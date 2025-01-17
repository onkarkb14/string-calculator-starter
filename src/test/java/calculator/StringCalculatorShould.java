package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
    int c =0;
    StringCalculator sc;
    @BeforeEach
    void begin()
    {
        c++;
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

    @Test
    void sum_of_multiple_numbers() {
        assertEquals(45, sc.add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    void  sum_with_delimeter_sn() {
        assertEquals(6, sc.add("1\n2,3"));
    }

    @Test
    void to_change_a_delimiter()
    {
        assertEquals(3,sc.add("//;\n1;2"));
    }

    @Test
    void negative_not_allowed()
    {
        assertThrows(IllegalArgumentException.class,() -> {
            sc.add("1,-5,-6");
        }, "negatives not allowed");
    }

    @Test
    void no_of_count(){
        assertEquals(c-1,sc.getCount());
    }

    @Test
    void no_less_than_1000(){
        assertEquals(2,sc.add("1002,2"));
    }

    @Test
    void Delimiters_can_be_various()
    {
        assertEquals(6,sc.add("//[***]\n1***2***3"));
    }

    @Test
    void available_multiple_delimiters()
    {
        assertEquals(6,sc.add("//[*][%]\n1*2%3"));
    }

    @Test
    void can_handle_multiple_delimiters()
    {
        assertEquals(6,sc.add("//[**][%%]\n1**2%%3"));
    }
}