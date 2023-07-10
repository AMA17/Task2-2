import java.util.prefs.PreferenceChangeListener;

public class Main {
    public static void main(String[] args) {
        int amount = 100;                 // сумма на счету
        int replenishment = 2000;         // пополнение
        int result = amount + replenishment;  // итого на счету
        int bonus = 0;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        }

        System.out.println(" Итоговый счет: " + (result + bonus));  // вывести на экран итоговую сумму
        System.out.println(" Количество бонусных рублей: " + bonus); // вывести на экран сумму бонусов

    }

}