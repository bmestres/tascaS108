package nivell02.exercise01;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


public class properNameFilterTest {

    @Test
    void listsContentMustMatch(){
        List<String> properNames = List.of("Ana", "Samuel", "Sofia", "Leo", "Ander",
                "Daniel", "Ada", "Maria", "Hugo");

        List<String> filteredNames = ProperNameFilter.filterElements(properNames);

        assertThat(filteredNames).containsExactly("Ana", "Ada");
    }




}
