package nivell01.exercice02;

import java.util.List;

import static nivell01.exercice01.ListOfStrings.STRING_LIST;

public class Main {
    public static void main(String[] args) {

        ListOfStrings originalList = new ListOfStrings();
        System.out.println("Original list:");
        ListPrinter.printList(STRING_LIST);

        System.out.println();
        System.out.println("Filtered list (Only elements containing letter \"o\" and larger than five characters):");
        List<String> filteredList = originalList.filterElementsWithLetterOAndLargerThanFive();
        ListPrinter.printList(filteredList);
    }
}
