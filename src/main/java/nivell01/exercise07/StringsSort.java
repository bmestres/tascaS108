package nivell01.exercise07;

import java.util.Comparator;

public class StringsSort {
    public static Comparator<Object> LengthOrder = (element1, element2) -> {
        int length1 = element1.toString().length();
        int length2 = element2.toString().length();

        return Integer.compare(length2, length1);
    };
}
