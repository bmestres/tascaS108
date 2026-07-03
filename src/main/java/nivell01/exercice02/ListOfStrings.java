package nivell01.exercice02;

import java.util.List;

import static nivell01.exercice01.ListOfStrings.stringList;

public class ListOfStrings {

    public List<String> filterElementsWithLetterOAndLargerThanFive() {
        return stringList.stream().filter((string) -> (string.contains("o") || string.contains("O")) && string.length() > 5).toList();
    }
}

