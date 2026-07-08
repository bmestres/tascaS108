package nivell01.exercise06;

import java.util.Comparator;

public class StringsSort {

     public static Comparator<Object> lengthOrder = (element1, element2) -> {
         int length1 = element1.toString().length();
         int length2 = element2.toString().length();

         return Integer.compare(length1, length2);
     };
}