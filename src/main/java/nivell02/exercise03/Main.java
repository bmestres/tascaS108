package nivell02.exercise03;

public class Main {
    public static void main(String[] args) {

        Numbers sum = (number1, number2) -> {return number1 + number2;};
        Numbers subtraction = (number1, number2) -> {return number1 - number2;};
        Numbers product = (number1, number2) -> {return number1*number2;};
        Numbers division =(number1, number2) -> {return number1/number2;};

        final float operand1 = 37.8f;
        final float operand2 = 48.9f;

        System.out.format("%.1f + %.1f = %.2f\n", operand1, operand2, sum.operation(operand1, operand2));
        System.out.format("%.1f - %.1f = %.2f\n", operand1, operand2, subtraction.operation(operand1, operand2));
        System.out.format("%.1f * %.1f = %.2f\n", operand1, operand2, product.operation(operand1, operand2));
        System.out.format("%.1f / %.1f = %.2f\n", operand1, operand2, division.operation(operand1, operand2));

    }
}
