package nivell01.exercici06;

import java.util.Comparator;

public class StringsSort {

     public static Comparator<Object> LengthOrder = (element1, element2) -> {
         int length01 = element1.toString().length();
         int length02 = element2.toString().length();

         return Integer.compare(length01, length02);
     };
}