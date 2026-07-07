package nivell01.exercice02;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static nivell01.exercice01.ListOfStrings.STRING_LIST;

public class ListOfStrings {

    private static final int MAX_LENGTH = 5;

    public static List<String> filterElementsWithLetterOAndLargerThanFive() {
        Predicate<String> stringFilter = (string) -> ((string.contains("o") || string.contains("O")) && string.length() > MAX_LENGTH);
        return STRING_LIST.stream().filter(stringFilter).toList();
    }
}