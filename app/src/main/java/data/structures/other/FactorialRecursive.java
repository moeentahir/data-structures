package data.structures.other;

public class FactorialRecursive {
    public static int compute(int number) {
        if (number <= 1) {
            return 1;
        }

        return number * compute(number - 1);
    }
}
