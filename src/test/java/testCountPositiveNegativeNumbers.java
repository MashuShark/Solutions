import If.CountPositiveNegativeNumbers;

import java.lang.reflect.Array;

public class testCountPositiveNegativeNumbers {
    public static void main(String[] args) {
        System.out.println(CountPositiveNegativeNumbers.toCountPositiveNegativeNumbers(1, -2, 3));
        System.out.println(CountPositiveNegativeNumbers.toCountPositiveNegativeNumbers(-9, -8, -7));
        System.out.println(CountPositiveNegativeNumbers.toCountPositiveNegativeNumbers(0, -0, 2));
        System.out.println(CountPositiveNegativeNumbers.toCountPositiveNegativeNumbers(7, 2, 1));
    }
}
