package nivell01.exercise06;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringsSort {

    public static List<Object> orderListFromShortToLong(List<Object> originalList){

        Predicate<Object> filterConditions = (element) -> {
            return element instanceof String;
        };

        Function<Object, String> objectToString = (element) -> {
            return (String)element;
        };

        Comparator<String> lengthOrder = (element1, element2) -> {
            int length1 = element1.length();
            int length2 = element2.length();
            return Integer.compare(length1, length2);
        };

        return originalList.stream().filter(filterConditions).map(objectToString).sorted(lengthOrder).collect(Collectors.toList());
    }

     public static Comparator<Object> lengthOrder = (element1, element2) -> {
         int length1 = element1.toString().length();
         int length2 = element2.toString().length();

         return Integer.compare(length1, length2);
     };
}