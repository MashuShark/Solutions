package Boolean;

public class TestExactlyOneNumberPositive {
    public static void main(String[] args) {
        System.out.println(ExactlyOneNumberPositive.checkExactlyOneNumberPositive(1, 2, 3) == true);
        System.out.println(ExactlyOneNumberPositive.checkExactlyOneNumberPositive(8, 7, 3) == true);
        System.out.println(ExactlyOneNumberPositive.checkExactlyOneNumberPositive(1, 5, 4) == true);
        System.out.println(ExactlyOneNumberPositive.checkExactlyOneNumberPositive(4, 2, 3) == false);
        System.out.println(ExactlyOneNumberPositive.checkExactlyOneNumberPositive(6, 9, 8) == false);
        System.out.println(ExactlyOneNumberPositive.checkExactlyOneNumberPositive(1, 7, 3) == false);
    }
}
