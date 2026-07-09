package nivell02.exercise03;

public class Operations {

    public static Numbers addition = (number1, number2) -> {return number1 + number2;};
    public static Numbers subtraction = (number1, number2) -> {return number1 - number2;};
    public static Numbers product = (number1, number2) -> {return number1*number2;};
    public static Numbers division =(number1, number2) -> {return number1/number2;};

    public static void printOperation(float operand1, float operand2, String operationSymbol, Numbers typeOfOperation){
        float result = typeOfOperation.operation(operand1, operand2);
        System.out.format("%.1f %s %.1f = %.2f\n", operand1, operationSymbol, operand2, result);
    }
}
