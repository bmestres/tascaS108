package nivell01.exercice01;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class ListOfStringsTest {
    @Test
    void outputListContainsAllElementsButTheOnesWithO(){
        ListOfStrings originalList = new ListOfStrings();
        List<String> filteredList = originalList.filterElementsWithLetterO();

        assertThat(filteredList).containsExactly("The world to come", "Notes on blindness", "Man on wire", "Love streams");


    }
}
