package nivell02.exercise01;

import java.util.List;
import java.util.function.Predicate;

public class ProperNameFilter {

    public ProperNameFilter(){
    }

    public static List<String> filterStartingWithAAndLargerThanFive(List<String> originalList){
        Predicate<String> stringFilter = (string) -> (Character.valueOf('A').equals(string.charAt(0))) && string.length() == 3;
        return originalList.stream().filter(stringFilter).toList();
    }
}
