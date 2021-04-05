package data.structures.other;

public class FactorialIterative {
    public static int compute(int number) {
        if (number == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
