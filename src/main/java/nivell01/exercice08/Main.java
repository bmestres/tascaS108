package nivell01.exercice08;

public class Main {
   public static void main(String[] args) {

       Text stringReverser = (string) -> {StringBuilder reversed = new StringBuilder();
       reversed.append(string);
       reversed.reverse();
       return reversed.toString();};

       String text = "origami";
       String textReverse = stringReverser.reverse(text);

       System.out.format("%s", textReverse);
    }
}
