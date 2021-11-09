package Integer;

public class Integer {



    /**
     *input: byte
     * output: Kilobyte/Megabyte/Gigabyte
     */
   public static int byteConversion(int Bytes, String conversion){
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

    public static int Reverse(int number){
        int first = number/100;
        int second = (number/10)%10;
        int third = number%10;

        int reversNumber = third * 100 + second *10 + first;

        return reversNumber;
    }


}
