package nivell01.exercici07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static nivell01.exercici07.StringsSort.LengthOrder;


public class Main {

    public static void main(String[] args) {

        List<Object> numbersAndString = List.of("cat", "blue", 42, 7, "sunshine", 3, "party", 12, 25, "runtime");

        List<Object> orderedList = new ArrayList<>(numbersAndString);

        orderedList.sort(LengthOrder);

        System.out.print(orderedList);
    }
}
