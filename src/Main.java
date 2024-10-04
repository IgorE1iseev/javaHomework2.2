public class Main {

    public static void main(String[] args) {

        int balance = 150;
        int refill = 1050;

        int bonus = 0;

        if (refill > 1000) {
            bonus = refill / 100;
            balance = balance + refill + bonus;
        } else {
            balance = balance + refill;
        }

        System.out.println("Итоговый баланс на счету: " + balance + " рублей.");
        System.out.println("Начислено " + bonus + " бонусных рублей.");

    }
}
