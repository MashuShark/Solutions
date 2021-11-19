package Boolean;

/**
 * A positive integer is given. Check that the number is an even two-digit number.
 */
public class EvenTwoDigit {
    public static boolean checkEvenTwoDigit (int number){
        if (number / 100 < 1 && number / 10 > 1 && number %2 ==0) return true;
        else return false;
    }
}
