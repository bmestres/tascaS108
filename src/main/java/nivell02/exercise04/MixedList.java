package nivell02.exercise04;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MixedList {

    public static List<Object> sortAlphabetically(List<Object>unsortedList){
        Comparator<Object> sortCriteria = (element1, element2) -> {
            char firstChar1 = element1.toString().charAt(0);
            char firstChar2 = element2.toString().charAt(0);

            return Integer.compare(firstChar1, firstChar2);
        };
        return unsortedList.stream().sorted(sortCriteria).toList();
    }
}
