package nivell02.exercise03;

public class Operations {

    public static Operation addition = (number1, number2) -> {return number1 + number2;};
    public static Operation subtraction = (number1, number2) -> {return number1 - number2;};
    public static Operation product = (number1, number2) -> {return number1*number2;};
    public static Operation division =(number1, number2) -> {return number1/number2;};

    public static void printOperation(float operand1, float operand2, String operationSymbol, Operation typeOfOperation){
        float result = typeOfOperation.operation(operand1, operand2);
        System.out.format("%.1f %s %.1f = %.2f\n", operand1, operationSymbol, operand2, result);
    }
}
