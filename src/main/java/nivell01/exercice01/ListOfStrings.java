package nivell01.exercice01;

import java.util.List;

public class ListOfStrings {
    public static final List<String> stringList = List.of("The world to come", "Moon", "Zama", "We are the best", "Man on wire", "Talk");

    public List<String> filterElementsWithLetterO() {
        return stringList.stream().filter((string) -> string.contains("o") || string.contains("O")).toList();
    }
}
