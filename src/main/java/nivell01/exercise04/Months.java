package nivell01.exercise04;

import java.util.List;

public class Months {
    private static final List<String> MONTHS_LIST = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

    public Months() {
    }

    public List<String> getMonthsList() {
        return MONTHS_LIST;
    }
}
