package nivell01.exercice02;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class ListOfStringsTest {
    @Test
    void outputOnlyContainsElementsWithOAndLargerThan5(){

        ListOfStrings originalList = new ListOfStrings();
        List<String> filteredList = originalList.filterElementsWithLetterOAndLargerThanFive();

        assertThat(filteredList).containsExactly("The world to come", "Man on wire");
    }

}
