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
        assertEquals(fizzbuzz.FizzBuzzMethod(15),"Fizz");
    }


}
