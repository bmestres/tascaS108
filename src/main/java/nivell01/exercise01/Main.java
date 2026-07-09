package nivell01.exercise01;

import java.util.List;

public class Main {
    static void main(String[] args) {

       List<String> originalList = StringsList.LIST_OF_STRINGS;

        System.out.println("Original list:");
        ListPrinter.printList(originalList);
        System.out.println();

        List<String> outputList = StringFilterer.filterElementsWithLetterO(originalList);
        System.out.println("Filtered list (Only elements containing letter \"o\"):");
        ListPrinter.printList(outputList);
    }
}
