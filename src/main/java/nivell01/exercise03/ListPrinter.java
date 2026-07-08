package nivell01.exercise03;

import java.util.List;
import java.util.function.Consumer;

public class ListPrinter {

    public ListPrinter(){
    }
    public static void printElements(List<String> list){
        Consumer<String> display = (month) -> {System.out.format("%s\n", month);};
        list.forEach(display);
    }
}
