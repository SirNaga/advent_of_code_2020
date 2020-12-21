package Day1;

import java.util.List;

public class Day1 {

    private final static int THE_NUMBER = 2020;

    public static int calculateNumberFor2(List<Integer> expenseList) {

        for (Integer number1 : expenseList) {
            for (Integer number2 : expenseList) {
                if ((number1 + number2) == THE_NUMBER) {
                    return number1 * number2;
                }
            }
        }
        return 0;
    }

    public static int calculateNumberFor3(List<Integer> expenseList) {

        for (Integer number1 : expenseList) {
            for (Integer number2 : expenseList) {
                for (Integer number3 : expenseList) {
                    if ((number1 + number2 + number3) == THE_NUMBER) {
                        return number1 * number2 * number3;
                    }
                }
            }
        }
        return 0;
    }

}
