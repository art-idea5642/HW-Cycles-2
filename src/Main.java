public class Main {

    public static void main(String[] args) {
        //task1
        double money = 15000;
        double total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + money;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (long) total + " рублей");
        }
        //task2
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task3
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //task4
        money = 15000;
        total = 0;
        month = 0;
        while (total <= 12_000_000) {
            month++;
            total = total + total * 7 / 100;
            total = total + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (long) total + " рублей");
        }
        System.out.println("Всего нужно месяцев - " + month);
        //task5
        money = 15000;
        total = 0;
        month = 0;
        while (total <= 12_000_000) {
            month++;
            total = total + total * 7 / 100;
            total = total + money;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (long) total + " рублей");
            }
        }
        System.out.println("Всего нужно месяцев - " + month);
        //task6
        money = 15000;
        total = 0;
        month = 0;
        do {
            month++;
            total = total + total * 7 / 100;
            total = total + money;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (long) total + " рублей");
            }
        }
        while (month <= (9 * 12));
        //task7
        int friday = 5;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
        while (friday <= 31);
        //task8
        int yearNow = 2024;
        for (int year = yearNow-200; year <= (yearNow + 100); year ++) {
            if (year%79==0) {
                System.out.println(year);
            }
        }
    }
}