package nivell01.exercise05;

public class Main {
    static void main(String[] args) {

        ValueSupplier supplier = () -> 3.1415;

        double piValue = supplier.getPiValue();

        System.out.printf("%.4f", piValue);
    }
}
