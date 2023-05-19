public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total += salary;
            i++;
            System.out.println("В месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        int w = 10;
        for (w = 10; w > 0; w -= 1) {
            System.out.print(" " + w + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int i = 0;
        for (i = 1; i <= 10; i++) {
            int borned = (y / 1000) * 17;
            int died = (y / 1000) * 8;
            y = (y + borned) - died;
            System.out.println("Год " + i + " численность населения составляет " + y + " человек");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15_000;
        var penny = 0.07;
        int i = 0;
        while (deposit < 12_000_000) {
            deposit += deposit * penny;
            i++;
            System.out.println("В месяце " + i + " сумма депозита равна " + deposit + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15_000;
        var penny = 0.07;
        int i = 0;
        while (deposit < 12_000_000) {
            deposit += deposit * penny;
            i++;
            if (i % 6 == 0) {
                System.out.println("В месяце " + i + " сумма депозита равна " + deposit + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15_000;
        var penny = 0.07;
        int i = 0;
        while (i <= 108) {
            deposit += deposit * penny;
            i++;
            if (i % 6 == 0) {
                System.out.println("В месяце " + i + " сумма депозита равна " + deposit + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int i = 5;
        for (i = 5; i <= 31; i+=7) {
            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int presentYear = 2023;
        int futureYear = 2123;
        int pastYear = 1823;
        // Выведем год для начала отсчета:
        // Найдем и округлим до целого наименьшее целочисленное значение года, кратного появлению кометы:
        int i = (pastYear / 79) + 1;
        // start year - первый год появления кометы в искомом нам диапазоне лет
        int startYear = i * 79;
        startYear = 1896;

        int a = 1896;
        for (a = 1896; a <= 2123; a+=79) {
            if (a % 79 == 0) {
                System.out.println(a);
            }
        }
    }
}