package Boolean;

/**
 * Three integers are given: A, B, C. Check that exactly one of the numbers A, B, C is positive. "
 */

public class ExactlyOneNumberPositive {
    public static boolean checkExactlyOneNumberPositive (int A, int B, int C){

        boolean checkAPositive = (A %2 == 0 && B %2 != 0 && C %2 != 0);
        boolean checkBPositive = (A %2 != 0 && B %2 == 0 && C %2 != 0);
        boolean checkCPositive = (A %2 != 0 && B %2 != 0 && C %2 == 0);
        if (checkAPositive || checkBPositive || checkCPositive)
            return true;
        else return false;
    }
}
