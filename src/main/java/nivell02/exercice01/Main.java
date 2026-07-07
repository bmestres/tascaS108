package nivell02.exercice01;

import java.util.ArrayList;
import java.util.List;

import static nivell02.exercice01.ProperName.PROPER_NAMES;

public class Main {
    static void main(String[] args) {

        System.out.println("Original list:");
        ListPrinter.printList(PROPER_NAMES);

        System.out.println();

        ProperName names = new ProperName();
        List<String> filteredNames = names.filterElements();

        System.out.println("Filtered list:");
        ListPrinter.printList(filteredNames);



    }
}
