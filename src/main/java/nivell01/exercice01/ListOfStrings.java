package nivell01.exercice01;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class ListOfStrings {
    public static final List<String> STRING_LIST = List.of("The world to come", "Moon", "Zama", "We are the best", "Man on wire", "Talk");

    public List<String> filterElementsWithLetterO() {

        Predicate<String> stringFilter = (string) -> string.contains("o") || string.contains("O");
        return STRING_LIST.stream().filter(stringFilter).toList();
    }
}
