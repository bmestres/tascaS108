package nivell01.exercise07;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static nivell01.exercise07.StringsSortReverse.lengthOrder;
import static org.assertj.core.api.Assertions.assertThat;

public class StringSortReverseTest {

    @Test
    void orderOfElementsHasToMatch(){

        List<Object> numbersAndString = List.of("cat", "blue", 42, 7, "sunshine", 3, "party", 12, 25, "runtime");
        List<Object> orderedList = new ArrayList<>(numbersAndString);
        orderedList.sort(lengthOrder);

        assertThat(orderedList).containsExactly("sunshine", "runtime", "party", "blue", "cat", 42, 12, 25, 7, 3);



    }
}
