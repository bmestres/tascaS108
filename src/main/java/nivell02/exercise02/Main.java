package nivell02.exercise02;

import java.util.List;

public class Main {

    static void main(String[] args) {
        List<Integer> originalListOfIntegers = List.of(3, 8, 1, 12, 7, 24, 33, 45);

        String mappedString = CSVBuilder.integerListToCsvString(originalListOfIntegers);
        System.out.format("%s", mappedString);
    }
}
