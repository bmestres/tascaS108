package nivell02.exercise02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CSVBuilderTest {

    @Test
    void stringsMustBeEqual(){

        List<Integer> originalListOfIntegers = List.of(3, 8, 1, 12, 7, 24, 33, 45);

        String mappedString = CSVBuilder.integerListToCsvString(originalListOfIntegers);

        assertThat(mappedString).isEqualTo("o3, e8, o1, e12, o7, e24, o33, o45");
    }
}
