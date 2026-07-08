package nivell01.exercise04;

import java.util.List;

public class ListPrinter {
    public ListPrinter() {
    }

    public static void printElements(List<String> list) {
        list.forEach(System.out::println);
    }
}
