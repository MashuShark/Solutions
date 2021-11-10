package Boolean;

public class testOneOfNumberIsOdd {
    public static void main(String[] args) {
        System.out.println(oneOfNumberIsOdd.toOneOfNumberIsOdd(0, 0) == false);
        System.out.println(oneOfNumberIsOdd.toOneOfNumberIsOdd(-3, 5) == false);
        System.out.println(oneOfNumberIsOdd.toOneOfNumberIsOdd(4, 7) == true);
        System.out.println(oneOfNumberIsOdd.toOneOfNumberIsOdd(3, 8) == true);
        System.out.println(oneOfNumberIsOdd.toOneOfNumberIsOdd(6, 201) == true);
        System.out.println(oneOfNumberIsOdd.toOneOfNumberIsOdd(-7, -11) == false);
    }
}
