package nivell02.exercise03;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorter {

    public ListSorter(){
    }

    public static List<Object> sortAlphabeticallyByFirstChar(List<Object> originalList){

        Comparator<Object> firstCharComparator = (element1, element2) -> {
            char character1 = element1.toString().charAt(0);
            char character2 = element2.toString().charAt(0);

            return Integer.compare(character1, character2);
        };
        return originalList.stream().sorted(firstCharComparator).collect(Collectors.toList());
    }


}
