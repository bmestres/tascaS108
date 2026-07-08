package nivell01.exercise02;

import nivell01.exercise01.StringsList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class ListOfStringsTest {
    @Test
    void outputOnlyContainsElementsWithOAndLargerThan5(){

        List<String> filteredList = StringFilterer.filterElementsWithLetterOAndLargerThanFive(StringsList.LIST_OF_STRINGS);

        assertThat(filteredList).containsExactly("The world to come", "Man on wire");
    }
}
