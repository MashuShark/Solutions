package Boolean;

public class testAtLeastOneOfNumbersISOdd {
    public static void main(String[] args) {
        System.out.println(AtLeastOneOfNumbersISOdd.toAtLeastOneOfNumbersISOdd(0, 0) == false);
        System.out.println(AtLeastOneOfNumbersISOdd.toAtLeastOneOfNumbersISOdd(-3, 5) == true);
        System.out.println(AtLeastOneOfNumbersISOdd.toAtLeastOneOfNumbersISOdd(4, 7) == true);
        System.out.println(AtLeastOneOfNumbersISOdd.toAtLeastOneOfNumbersISOdd(3, 8) == true);
        System.out.println(AtLeastOneOfNumbersISOdd.toAtLeastOneOfNumbersISOdd(6, 200) == false);
        System.out.println(AtLeastOneOfNumbersISOdd.toAtLeastOneOfNumbersISOdd(-7, -11) == true);
    }
}
