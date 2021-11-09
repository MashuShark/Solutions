package Integer;

public class reverseTripleDigits {
    public static int toReverse(int number){
        int first = number/100;
        int second = (number/10)%10;
        int third = number%10;

        int reversNumber = third * 100 + second *10 + first;

        return reversNumber;
    }
}
