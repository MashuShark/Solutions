package Integer;

import java.util.Arrays;

public class numberOfSquaresOnRectangle {

    /**
     * Даны целые положительные числа A, B, C. На прямоугольнике размера A × B
     * размещено максимально возможное количество квадратов со
     * стороной C (без наложений). Найти количество квадратов, размещенных
     * на прямоугольнике, а также площадь незанятой части прямоугольника.
     * Метод возвращвет соку значений {количество квадратов, свободная площадь}
     */
    public static String toNumberOfSquaresOnRectangle(int A, int B, int C) {

        int countSquare = (A / C) * (B / C);
        int freeArea = (A * B - (countSquare * C * C));
        int[] arr = new int[]{countSquare, freeArea};
        return Arrays.toString(arr);
    }
}

