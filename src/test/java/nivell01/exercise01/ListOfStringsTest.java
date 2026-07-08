package nivell01.exercise01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class ListOfStringsTest {
    @Test
    void outputOnlyContainsElementsWithO() {
        List<String> originalList = StringsList.LIST_OF_STRINGS;
        List<String> filteredList = StringFilterer.filterElementsWithLetterO(originalList);

        assertThat(filteredList).containsExactly("The world to come", "Notes on blindness", "Man on wire", "Love streams");
    }
}
