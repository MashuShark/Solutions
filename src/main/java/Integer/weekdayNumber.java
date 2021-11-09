package Integer;

public class weekdayNumber {
    /**
     * Дни недели пронумерованы следующим образом: 0 — воскресенье,
     * 1 — понедельник, 2 — вторник, . . . , 6 — суббота. Дано целое число K,
     * лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня
     * года, если известно, что в этом году 1 января было понедельником.
     */
    public static String toWeekdayNumber(int day){
        int mod = day%7;
        String dayOfWeek = "";
        switch (mod){
            case 0: dayOfWeek = "Sunday";
                break;
            case 1: dayOfWeek = "Monday";
                break;
            case 2: dayOfWeek = "Tuesday";
                break;
            case 3: dayOfWeek = "Wednesday";
                break;
            case 4: dayOfWeek = "Thursday";
                break;
            case 5: dayOfWeek = "Friday";
                break;
            case 6: dayOfWeek = "Saturday";
                break;
        }
        return dayOfWeek;
    }
}
