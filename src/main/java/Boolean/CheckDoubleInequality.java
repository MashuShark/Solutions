package Boolean;

public class CheckDoubleInequality {
    /**
     * Given three integers: A, B, C. Check double inequality A <B <C
     */
    public static boolean toCheckDoubleInequality (int A, int B, int C){
        return (A < B && B < C);
    }
}
