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
        while (total <= 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("В месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        int w = 10;
        for (w = 10; w > 0; w = w - 1) {
            System.out.print(" " + w + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int i = 0;
        for (i = 1; i <= 10; i = i + 1) {
            int borned = (y / 1000) * 17;
            int died = (y / 1000) * 8;
            y = (y + borned) - died;
            System.out.println("Год " + i + " численность населения составляет " + y + " человек");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15_000;
        int total = 0;
        int m = 0;
        int depositWithPenny = deposit + (deposit / 100) * 7;
        while (total <= 12_000_000) {
            total = total + depositWithPenny;
            m = m + 1;
            System.out.println("В месяце " + m + " сумма депозита равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15_000;
        int total = 0;
        int m = 0;
        int depositWithPenny = deposit + (deposit / 100) * 7;
        while (total <= 12_000_000) {
            total = total + depositWithPenny;
            m = m + 1;
            if (m % 6 == 0) {
                System.out.println("В месяце " + m + " сумма депозита равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15_000;
        int total = 0;
        int m = 0;
        int depositWithPenny = deposit + (deposit / 100) * 7;
        while (m <= 108) {
            total = total + depositWithPenny;
            m = m + 1;
            if (m % 6 == 0) {
                System.out.println("В месяце " + m + " сумма депозита равна " + total + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int i = 5;
        for (i = 5; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int i = 2123;
        for(i = 0; i <= 2123; i = i + 79) {
            if (i >= 1823) {
                System.out.println(i);
            }
        }
    }
}