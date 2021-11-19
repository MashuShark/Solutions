package Boolean;

public class TestEvenTwoDigit {
    public static void main(String[] args) {
        System.out.println(EvenTwoDigit.checkEvenTwoDigit(88)== true);
        System.out.println(EvenTwoDigit.checkEvenTwoDigit(89) == false);
        System.out.println(EvenTwoDigit.checkEvenTwoDigit(123) == false);
        System.out.println(EvenTwoDigit.checkEvenTwoDigit(8) == false);
        System.out.println(EvenTwoDigit.checkEvenTwoDigit(812) == false);
        System.out.println(EvenTwoDigit.checkEvenTwoDigit(9) == false);

    }
}
