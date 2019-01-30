package dummyPack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_FizzBuzz_if_number_is_divisible_by_15() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.getFizzBuzzOutput(450);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Fizz_if_number_is_divisible_by_3() {
        String expected = "Fizz";
        String actual = FizzBuzz.getFizzBuzzOutput(9);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Buzz_if_number_is_divisible_by_5() {
        String expected = "Buzz";
        String actual = FizzBuzz.getFizzBuzzOutput(20);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_the_number_itself_if_number_is_not_divisible_by_specified_numbers() {
        String expected = "11";
        String actual = FizzBuzz.getFizzBuzzOutput(11);
        assertEquals(expected, actual);
    }

}
