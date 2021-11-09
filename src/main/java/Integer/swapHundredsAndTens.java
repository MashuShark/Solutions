package Integer;

public class swapHundredsAndTens {
    /**
     * Дано трехзначное число. В нем зачеркнули первую справа цифру
     * и приписали ее слева. Вывести полученное число.
     */
    public static int toSwapHundredsAndTens(int num) {
        int first = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;
        num = second * 100 + third * 10 + first;

        return num;
    }
}
