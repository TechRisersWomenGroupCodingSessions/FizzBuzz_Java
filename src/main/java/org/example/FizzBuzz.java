package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> FizzBuzzMethod(List<Integer> listOfNumbers) {
        List<String> listAsString = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if(listOfNumbers.get(i)%3 == 0 && listOfNumbers.get(i)%5 == 0) {
                listAsString.add("FizzBuzz");
            }
            else if(listOfNumbers.get(i)%3 == 0) {
                listAsString.add("Fizz");
            }
            else if(listOfNumbers.get(i)%5 == 0) {
                listAsString.add("Buzz");
            }
            else {
                listAsString.add(listOfNumbers.get(i) + "");
            }
        }
        return listAsString;
    }
}