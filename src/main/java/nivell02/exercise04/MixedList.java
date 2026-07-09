package nivell02.exercise04;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MixedList {

    public static List<String> sortAlphabetically(List<String>unsortedList){
        Comparator<String> sortCriteria = (element1, element2) -> {
            char firstChar1 = element1.charAt(0);
            char firstChar2 = element2.charAt(0);

            return Integer.compare(firstChar1, firstChar2);
        };
        return unsortedList.stream().sorted(sortCriteria).collect(Collectors.toList());
    }

    public static List <String> sortEFirst(List<String> unsortedList){
        return unsortedList.stream().sorted((element1, element2) -> {
            boolean elem1 = element1.contains("e");
            boolean elem2 = element2.contains("e");

            return Boolean.compare(elem2, elem1);
        }).collect(Collectors.toList());
    }

    public static List <String> mapAto4(List<String>unmappedList){
        return unmappedList.stream().map((element) -> element.replace('a', '4'))
                .collect(Collectors.toList());
    }

    public static List <String> filterNumericalOnly(List<String> unfilteredList){
        return unfilteredList.stream().filter((String element) -> {return element.matches("\\d+");})
                .collect(Collectors.toList());
    }
}
