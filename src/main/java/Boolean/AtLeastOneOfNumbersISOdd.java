package Boolean;

public class AtLeastOneOfNumbersISOdd {
    /**
     * Two integers: A, B are given. Check that at least one of the numbers A and B is odd
     */
    public static boolean toAtLeastOneOfNumbersISOdd (int A, int B) {
        return A % 2 != 0 || B % 2 != 0;
    }

}
