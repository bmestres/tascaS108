package nivell02.exercise01;

import java.util.function.Predicate;

public interface NamesList {
    Predicate <String> stringFilter = (string) -> Character.valueOf('A').equals(string.charAt(0));
}
