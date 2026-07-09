package nivell01.exercise08;

public class TextFormat {

    public static String textReverse (String originalText){

        Text stringReverse = (string) -> {
            String r = "";
            for(int i = 0; i < string.length(); i++){
                r = string.charAt(i) + r;
            }
            return r;
        };
        return stringReverse.reverse(originalText);
    }

}