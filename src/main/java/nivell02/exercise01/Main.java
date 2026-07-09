package nivell02.exercise01;

import java.util.List;


public class Main {
    static void main(String[] args) {

        List<String> properNames = List.of("Ana", "Samuel", "Sofia", "Leo", "Ander", "Daniel", "Ada", "Maria", "Hugo");
        System.out.println("Original list:");
        ListPrinter.printList(properNames);

        System.out.println();

       List<String> filteredNames = ProperNameFilter.filterElements(properNames);

        System.out.println("Filtered list:");
        ListPrinter.printList(filteredNames);



    }
}
