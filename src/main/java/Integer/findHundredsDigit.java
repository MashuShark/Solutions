package Integer;

public class findHundredsDigit {
    /**
     * Дано целое число, большее 999. Используя одну операцию деления
     * нацело и одну операцию взятия остатка от деления, найти цифру,
     * соответствующую разряду сотен в записи этого числа.
     */
    public static int toFindHundredsDigit(int num){
        int hundred = (num/100)%10;
        return hundred;
    }
}
