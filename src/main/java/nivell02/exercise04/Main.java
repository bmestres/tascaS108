package nivell02.exercise04;

import java.util.List;

public class Main {
    static void main(String[] args) {

        List<String> unsortedMixedList = List.of("party", "12", "morning", "7", "42", "runtime", "sunshine", "3", "aviation");

        List<String> sortedAlphabetically = MixedList.sortAlphabetically(unsortedMixedList);

        List<String> sortedEFirst = MixedList.sortEFirst(unsortedMixedList);

        List<String> mappedATo4 = MixedList.mapAto4(unsortedMixedList);

        List<String>numericalElementsOnly = MixedList.filterNumericalOnly(unsortedMixedList);
    }
}
