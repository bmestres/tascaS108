package nivell01.exercise02;

import nivell01.exercise01.StringsList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Original list:");
        ListPrinter.printList(StringsList.LIST_OF_STRINGS);

        System.out.println();
        System.out.println("Filtered list (Only elements containing letter \"o\" and larger than five characters):");
        List<String> filteredList = StringFilterer.filterElementsWithLetterOAndLargerThanFive(StringsList.LIST_OF_STRINGS);
        ListPrinter.printList(filteredList);
    }
}
