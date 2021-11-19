package Boolean;

public class testCheckInequalities {
    public static void main(String[] args) {
        System.out.println(CheckInequalities.toCheckInequalities(8, -9) == true);
        System.out.println(CheckInequalities.toCheckInequalities(2, 3) == false);
        System.out.println(CheckInequalities.toCheckInequalities(2, 4)== false);
        System.out.println(CheckInequalities.toCheckInequalities(3, 2)== true);
        System.out.println(CheckInequalities.toCheckInequalities(6, 0)== true);
    }
}
