package nivell02.exercise04;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> unsortedMixedList = List.of("party", 12, "morning", 7, 42, "runtime", "sunshine", 3);
        List<Object> sortedMixedList = MixedList.sortAlphabetically(unsortedMixedList);
    }
}
