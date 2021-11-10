package Integer;

public class weekDayNumber2 {
/**    Дни недели пронумерованы следующим образом: 1 — понедель-
    ник, 2 — вторник, . . . , 6 — суббота, 7 — воскресенье. Дано целое число K,
    лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня
    года, если известно, что в этом году 1 января было вторником.*/

public static String toWeekdayNumber(int day){
    int mod = (day+1)%7;
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
