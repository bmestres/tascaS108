package nivell01.exercice02;



import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListOfStrings originalList = new ListOfStrings();
        List<String> filteredList = originalList.filterElementsWithLetterOAndLargerThanFive();
        ListPrinter.printList(filteredList);
    }
}
