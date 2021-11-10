package Integer;

public class centuryNumber {

    /**
     * Дан номер некоторого года (целое положительное число).
     * Определить соответствующий ему номер столетия,
     * учитывая, что, к примеру, началом 20 столетия был 1901 год.
     */
    public static int toCenturyNumber(int year){
        if (year <= 0){
            return 0;
        } else if (year <= 100){
            return 1;
        } else if (year % 100 == 0){
            return (year / 100);
        } else return (year / 100)+1;
    }

}
