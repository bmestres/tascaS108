package nivell01.exercise08;

public class TextFormat {

    public static Text StringReverser = (string) -> {StringBuilder reversed = new StringBuilder(string);
        return reversed.reverse().toString();};
}