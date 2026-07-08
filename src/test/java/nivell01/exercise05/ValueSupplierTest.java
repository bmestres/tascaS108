package nivell01.exercise05;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ValueSupplierTest {

    @Test
    void valueHasToMatch(){

        double piValue = 3.1415;
        ValueSupplier supplier = () -> 3.1415;

        double value = supplier.getPiValue();

        assertThat(piValue).isEqualTo(value);
    }
}
