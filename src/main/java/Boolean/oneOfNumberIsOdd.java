package Boolean;

public class oneOfNumberIsOdd {
    /**
     * Two integers: A, B are given. Exactly one of the numbers A and B is odd
     */
    public static boolean toOneOfNumberIsOdd (int A, int B){
        return A % 2 != 0 ^ B % 2 != 0;
    }
}
