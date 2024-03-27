import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


@Test void represent1AsAString() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    List<Integer> listOfNumbers = List.of(1);
    List<String> listOfStrings = List.of("1");
    assertEquals(fizzbuzz.FizzBuzzMethod(listOfNumbers),listOfStrings);
}

@Test void represent3AsFizz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    List<Integer> listOfNumbers = List.of(3);
    List<String> listOfStrings = List.of("Fizz");
    assertEquals(fizzbuzz.FizzBuzzMethod(listOfNumbers),listOfStrings);
}

    @Test void divisibleBy3isFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        List<Integer> listOfNumbers = List.of(9);
        List<String> listOfStrings = List.of("Fizz");
        assertEquals(fizzbuzz.FizzBuzzMethod(listOfNumbers),listOfStrings);
    }


    @Test void divisibleby5isBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        List<Integer> listOfNumbers = List.of(10);
        List<String> listOfStrings = List.of("Buzz");
        assertEquals(fizzbuzz.FizzBuzzMethod(listOfNumbers),listOfStrings);
    }


    @Test void divisibleby5and3isFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        List<Integer> listOfNumbers = List.of(15);
        List<String> listOfStrings = List.of("FizzBuzz");
        assertEquals(fizzbuzz.FizzBuzzMethod(listOfNumbers),listOfStrings);
    }

    @Test void notdivisibleby5or3isStringRepresentativeOfNumber() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        List<Integer> listOfNumbers = List.of(13);
        List<String> listOfStrings = List.of("13");
        assertEquals(fizzbuzz.FizzBuzzMethod(listOfNumbers),listOfStrings);
    }

    @Test void takesAListOfNummbers() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        List<Integer> listOfNumbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<String> listOfStrings = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        assertEquals(fizzbuzz.FizzBuzzMethod(listOfNumbers), listOfStrings);
    }


}
