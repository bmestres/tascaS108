package nivell01.exercise01;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilterer {

    public static List<String> filterElementsWithLetterO(List<String> originalList) {

        Predicate<String> stringFilter = (string) -> string.contains("o") || string.contains("O");
        return originalList.stream().filter(stringFilter).collect(Collectors.toList());
    }
}
