package nivell02.exercise03;

public class Main {
    static void main(String[] args) {

        final float operand1 = 37.8f;
        final float operand2 = 48.9f;

        Operations.printOperation(operand1, operand2, "+", Operations.addition);
        Operations.printOperation(operand1, operand2, "-", Operations.subtraction);
        Operations.printOperation(operand1, operand2, "*", Operations.product);
        Operations.printOperation(operand1, operand2, "/", Operations.division);

    }
}
