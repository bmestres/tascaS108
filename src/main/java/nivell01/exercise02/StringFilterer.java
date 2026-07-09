package nivell01.exercise02;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StringFilterer {

    private static final int MAX_LENGTH = 5;

    public static List<String> filterElementsWithLetterOAndLargerThanFive(List<String> originalList) {

        Predicate<String> stringFilter = (string) -> ((string.contains("o") || string.contains("O")) && string.length() > MAX_LENGTH);
        return originalList.stream().filter(stringFilter).collect(toList());
    }
}
