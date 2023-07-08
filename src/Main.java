import java.util.prefs.PreferenceChangeListener;

public class Main {
    public static void main(String[] args) {
        int amount = 100;                 // сумма на счету
        int replenishment = 1500;         // пополнение
        int x = amount + replenishment;  // итого на счету
        boolean bonus = true;

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println(" Итоговый счет: " + (x + bonus));  // вывести на экран итоговую сумму
        System.out.println(" Количество бонусных рублей: " + bonus); // вывести на экран сумму бонусов

    }

}