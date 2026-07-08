package nivell01.exercise01;

import java.util.List;

public final class ListPrinter {
    public static void printList(List<String> listToPrint) {
        for (String elem : listToPrint) {
            System.out.format("\"%s\", ", elem);
        }
    }
}
