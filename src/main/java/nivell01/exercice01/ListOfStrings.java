package nivell01.exercice01;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {
    private static final List<String>stringList = List.of("The world to come", "Notes on blindness", "Zama", "We are the best", "Man on wire", "Love streams", "Talk");

    public List<String> getListOfStrings(){
        return stringList;
    }

    public List<String> filterElementsWithLetterO(List<String>strings){
        List<String> elementsWithO = new ArrayList<String>();

        return strings.stream().filter((string) -> string.contains("o") || string.contains("O")).toList();

    }
}
