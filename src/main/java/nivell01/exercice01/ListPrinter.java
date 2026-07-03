package nivell01.exercice01;

import java.util.List;

public final class ListPrinter {

    private ListPrinter(){
    }
    public static void printList(List<String> listToPrint) {
        for (String elem : listToPrint) {
            System.out.format("\"%s\", ", elem);
        }
    }
}
