package nivell01.exercise06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static nivell01.exercise06.StringsSort.lengthOrder;
import static org.assertj.core.api.Assertions.assertThat;

public class StringSortTest {

    @Test
    void orderOfTheElementsHasToMatch(){
        List<Object> numbersAndString = List.of("cat", "blue", 42, 7, "sunshine", 3, "party", 12, 25, "runtime");
        List<Object> orderedList = new ArrayList<>(numbersAndString);
        orderedList.sort(lengthOrder);

        assertThat(orderedList).containsExactly(7, 3, 42, 12, 25, "cat", "blue", "party", "runtime", "sunshine");
    }
}
