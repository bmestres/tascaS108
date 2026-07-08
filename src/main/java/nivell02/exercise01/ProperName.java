package nivell02.exercise01;

import java.util.List;
import java.util.function.Predicate;

public class ProperName {

    public static final List<String> PROPER_NAMES = List.of("Ana", "Samuel", "Sofia", "Leo", "Ander", "Daniel", "Ada", "Maria", "Hugo");

    public ProperName(){
    }

    public List<String> filterElements(){
        Predicate<String> stringFilter = (string) -> (Character.valueOf('A').equals(string.charAt(0))) && string.length() == 3;
        return PROPER_NAMES.stream().filter(stringFilter).toList();
    }
}
