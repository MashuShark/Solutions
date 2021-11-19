package Boolean;

public class testCheckDoubleInequality {
    public static void main(String[] args) {
        System.out.println(CheckDoubleInequality.toCheckDoubleInequality(0, 0, 0) == false);
        System.out.println(CheckDoubleInequality.toCheckDoubleInequality(1, 2, 3) == true);
        System.out.println(CheckDoubleInequality.toCheckDoubleInequality(7, 6, 7) == false);
        System.out.println(CheckDoubleInequality.toCheckDoubleInequality(3, 6, 8) == true);
        System.out.println(CheckDoubleInequality.toCheckDoubleInequality(-20, -9, 0) == true);
    }
}
