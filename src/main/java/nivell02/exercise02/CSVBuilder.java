package nivell02.exercise02;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CSVBuilder {

    public static String integerListToCsvString(List<Integer> originalList){

        Function<Integer, String> integerToString = (number) -> {if(number % 2 == 0){
        return String.format("e%d", number);} else { return String.format("o%d", number);
        }};
        return originalList.stream().map(integerToString).collect(Collectors.joining(", "));
    }


}
