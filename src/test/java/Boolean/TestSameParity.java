package Boolean;

public class TestSameParity {
    public static void main(String[] args) {
        System.out.println(SameParity.checkSameParity(1,1) == true);
        System.out.println(SameParity.checkSameParity(1,2) == false);
        System.out.println(SameParity.checkSameParity(4,6) == true);
        System.out.println(SameParity.checkSameParity(8,9) == false);
        System.out.println(SameParity.checkSameParity(0,9) == false);
        System.out.println(SameParity.checkSameParity(8,0) == true);

    }
}
