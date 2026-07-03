package nivell01.exercice02;

import java.util.List;

import static nivell01.exercice01.ListOfStrings.STRING_LIST;

public class ListOfStrings {

    public List<String> filterElementsWithLetterOAndLargerThanFive() {
        return STRING_LIST.stream().filter((string) -> (string.contains("o") || string.contains("O")) && string.length() > 5).toList();
    }
}