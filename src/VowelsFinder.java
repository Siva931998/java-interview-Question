package src;

import java.util.Arrays;
import java.util.List;

public class VowelsFinder {

    public static void main(String[] args) {
        String inputString = "Hello, java 8 Demo Vowels Example";

        String lowercaseString = inputString.toLowerCase();

        List<Character> VowelString = Arrays.asList('a','e','i','o','u');

        long countofvowels = lowercaseString.chars().mapToObj(c -> (char) c).filter(VowelString::contains).count();

        System.out.println(countofvowels);


    }
}
