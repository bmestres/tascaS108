package nivell02.exercise01;

import java.util.List;

public class ListPrinter {

    public static void printList(List<String> listToPrint){
        for(String elem : listToPrint){
            System.out.format("%s\n", elem);
        }
    }
}
