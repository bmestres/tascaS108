package nivell02.exercise03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Object> mixedList = List.of(16,"Ana" ,31, "Samuel", "Maria", 5, 20, "Daniel", 19);

        List<Object> sortedList = ListSorter.sortAlphabeticallyByFirstChar(mixedList);
    }
}
