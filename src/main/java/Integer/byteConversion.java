package Integer;

public class byteConversion {
    /**
     *input: byte
     * output: Kilobyte/Megabyte/Gigabyte
     */
    public static int toConversion(int Bytes, String conversion){
        int KB = 1024;
        int MB = 1048576;
        int GB = 1073741824;

        if (conversion == "KB"){
            return (Bytes/KB);
        } else if (conversion == "MB"){
            return (Bytes/MB);
        } else if (conversion == "GB") {
            return (Bytes / GB);
        } else return 0;

    }
}
