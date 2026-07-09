package nivell01.exercise08;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringInReverseTest {

    @Test
    void stringMustMatch() {

        String originalString = "origami";
        final String expectedString = "imagiro";

        String textInReverse = TextFormat.textReverse(originalString);

        assertThat(textInReverse).isEqualTo(expectedString);
    }
}
