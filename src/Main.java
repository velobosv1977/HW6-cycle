public class Main {
    public static void main(String[] args) {
        //Task 1.
        System.out.println("Задача 1. Целые от 1 до 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ; ");
        }
        //Task 2.
        System.out.println();
        System.out.println("Задача 2. Целые от 10 до 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ; ");
        }
        //Task 3.
        System.out.println();
        System.out.println("Задача 3. Чётные числа от 0 до 17");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ; ");
        }
        //Task 4 .
        System.out.println();
        System.out.println("Задача 4. Числа от 10 до -10 от большего к меньшему");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ; ");
        }
        //Task 5 .
        System.out.println("Задача 5. Високосный год");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + "год является високосным; ");
        }
        //Task 6.
        System.out.println("Задача 6. Арифметический ряд от 7");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + ";");
        }
        //Task 7.
        System.out.println();
        System.out.println("Задача 7. Геометрический ряд от 2");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + "; ");
        }
        //Task 8.
        System.out.println();
        System.out.println("Задача 8. Сумма накоплений");
        int vklad = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month++) {
            sum += vklad;
            System.out.println("Месяц " + month + " сумма накоплени равна " + sum + " рублей");
        }
        //Task 9.
        System.out.println("Задача 9. Сумма наколплений с %");
        vklad = 29000;
        sum = 0;
        double percent = 10 / 100;
        for (int month = 1; month <= 12; month++) {
            sum += vklad;
            sum = sum + sum / 100;
            System.out.println("Месяц " + month + " сумма накоплени равна " + sum + " рублей");
        }
        //Task 10.
        System.out.println("Задача 10. Таблица умножения на 2");
        for (int a = 1; a <= 10; a++) {
            System.out.printf("%d * %d=%d%n", 2, a, 2 * a);
        }
    }
}