package Boolean;

/**
 * You are given two integers: A, B. Check that A and B have the same parity.
 */
public class SameParity {
    public static boolean checkSameParity(int A, int B){
        if ((A + B) %2 != 0) return false;
        else return true;
    }
}
