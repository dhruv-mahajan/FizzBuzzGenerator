package dummyPack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void test_if_FizzBuzz_is_returned_For_testValue(){
        String expected="FizzBuzz";
        String actual=FizzBuzz.getFizzBuzzOutput(450);
        assertEquals(expected,actual);
    }
    @Test
    public void test_if_Fizz_is_returned_For_testValue(){
        String expected="Fizz";
        String actual=FizzBuzz.getFizzBuzzOutput(9);
        assertEquals(expected,actual);
    }

    @Test
    public void test_if_Buzz_is_returned_For_testValue(){
        String expected="Buzz";
        String actual=FizzBuzz.getFizzBuzzOutput(20);
        assertEquals(expected,actual);
    }
}
