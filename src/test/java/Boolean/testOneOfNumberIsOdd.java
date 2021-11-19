package Boolean;

public class testOneOfNumberIsOdd {
    public static void main(String[] args) {
        System.out.println(OneOfNumberIsOdd.toOneOfNumberIsOdd(0, 0) == false);
        System.out.println(OneOfNumberIsOdd.toOneOfNumberIsOdd(-3, 5) == false);
        System.out.println(OneOfNumberIsOdd.toOneOfNumberIsOdd(4, 7) == true);
        System.out.println(OneOfNumberIsOdd.toOneOfNumberIsOdd(3, 8) == true);
        System.out.println(OneOfNumberIsOdd.toOneOfNumberIsOdd(6, 201) == true);
        System.out.println(OneOfNumberIsOdd.toOneOfNumberIsOdd(-7, -11) == false);
    }
}
