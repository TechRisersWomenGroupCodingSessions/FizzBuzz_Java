import org.example.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


@Test void represent1AsAString() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals(fizzbuzz.FizzBuzzMethod(1),"1");
}

@Test void represent3AsFizz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals(fizzbuzz.FizzBuzzMethod(3),"Fizz");
}

    @Test void divisibleBy3isFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.FizzBuzzMethod(9),"Fizz");
    }

    @Test void divisibleby5isBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.FizzBuzzMethod(10),"Buzz");
    }

    @Test void divisibleby5and3isFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.FizzBuzzMethod(15),"FizzBuzz");
    }

    @Test void notdivisibleby5or3isStringRepresentativeOfNumber() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.FizzBuzzMethod(13),"13");
    }

    //list of numbers


}
