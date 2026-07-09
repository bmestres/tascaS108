package nivell01.exercise01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class ListOfStringsTest {

    private static final List<String> LIST_OF_STRINGS = List.of("The world to come", "Moon", "Zama", "We are the best", "Man on wire", "Talk");
    @Test
    void outputOnlyContainsElementsWithO() {

        List<String> filteredList = StringFilterer.filterElementsWithLetterO(LIST_OF_STRINGS);

        assertThat(filteredList).containsExactly("The world to come", "Notes on blindness", "Man on wire", "Love streams");
    }
}
