package If;

import java.util.Arrays;

/**
 *Three integers are given. Find the number of positive and the number of negative numbers in the original set.
 */
public class CountPositiveNegativeNumbers {
    public static String toCountPositiveNegativeNumbers(int number1, int number2, int number3) {
        int[] arrayOfNumbers = {number1, number2, number3};
        int countPositive = 0;
        int countNegative = 0;


        for (int i = 0; i < arrayOfNumbers.length; ++i) {
            if (arrayOfNumbers[i] >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        int[] arrayResult = new int [] {countPositive, countNegative};
        return Arrays.toString(arrayResult);
    }
}