package Integer;

public class testbyteConversion {
    public static void main(String[] args) {
        System.out.println(byteConversion.toConversion(2054, "KB") == 2);
        System.out.println(byteConversion.toConversion(6291465, "MB") == 6);
        System.out.println(byteConversion.toConversion(1073743024, "GB") == 1);
        System.out.println(byteConversion.toConversion(4098,"") == 0);
    }

}
