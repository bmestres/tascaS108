package nivell01.exercice01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfStrings originalList = new ListOfStrings();
        List<String> filteredList = originalList.filterElementsWithLetterO();
        originalList.printList(filteredList);
    }
}
