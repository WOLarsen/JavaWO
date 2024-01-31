package dz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, a, b, c, d, e, mult, sum;
        System.out.printf("Введите пятизначное число: ");
        num = input.nextInt();
        a = num % 10;
        b = (num % 100) / 10;
        c = (num / 100) % 10;
        d = (num / 1000) % 10;
        e = num / 10000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        mult = a * b * c * d * e;
        System.out.println("Произведение цифр числа: " + mult);
        sum = a + b + c + d + e;
        float sum1 = (float) sum / 5;
        System.out.printf("Среднее арифметическое значение: %.2f %n", sum1);

       /* System.out.printf("%-10s  %-8s %-7s %n", "Переменная типа", "byte", "занимает " + Byte.BYTES + " байт в памяти  (" + Byte.SIZE + " бит в памяти)" +
                "  и принимает значения в диапазоне от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.printf("%-10s  %-8s %-7s %n", "Переменная типа", "short", "занимает " + Short.BYTES+ " байт в памяти  (" + Short.SIZE + " бит в памяти)" +
                " и принимает значения в диапазоне от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.printf("%-10s  %-8s %-7s %n", "Переменная типа", "int", "занимает " + Integer.BYTES+ " байт в памяти  (" + Integer.SIZE + " бит в памяти)" +
                " и принимает значения в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.printf("%-10s  %-8s %-7s %n", "Переменная типа", "long", "занимает " + Long.BYTES+ " байт в памяти  (" + Long.SIZE + " бит в памяти)" +
                " и принимает значения в диапазоне от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("");
        System.out.printf("%-10s  %-8s %-7s %n", "Переменная типа", "float", "занимает " + Float.BYTES+ " байт в памяти  (" + Float.SIZE + " бит в памяти)" +
                " и принимает значения в диапазоне от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.printf("%-10s  %-8s %-7s %n", "Переменная типа", "double", "занимает " + Double.BYTES+ " байт в памяти  (" + Double.SIZE + " бит в памяти)" +
                " и принимает значения в диапазоне от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);*/

        /*System.out.print(" Как вас зовут? ");
        String name = input.nextLine();
        System.out.print(" Сколько вам лет? ");
        int age = input.nextInt();
        System.out.print(" Откуда вы? ");
        String town = input.next();
        System.out.printf(" Вас зовут: %s.\n Ваш возраст: %d.\n Ваш город: %s", name,age, town);*/

        /*int n, kop;
        System.out.print("Введите число от 1 до 99: ");
        n = input.nextInt();
        kop = n;
        if (n >= 11 && n <= 14) {
            System.out.println(n + " копеек");
        } else {
            kop = kop % 10;
            if (kop == 1) {
                System.out.println(n + " копейка");
            } else if (kop >= 2 && kop <= 4) {
                System.out.println(n + " копейки");
            } else {
                System.out.println(n + " копеек");
            }
        }
*/
       /* System.out.print("Введите количество часов: ");
        int hour = input.nextInt();
        switch ((hour > 0 && hour <= 5) ? 2 :
                (hour >= 6 && hour <= 11) ? 3 :
                (hour >= 12 && hour <= 17) ? 4 :
                (hour >= 18 && hour <= 24) ? 5 : 0) {
            case 2 -> System.out.println("Доброй ночи!");
            case 3 -> System.out.println("Доброе утро!");
            case 4 -> System.out.println("Добрый день!");
            case 5 -> System.out.println("Добрый вечер!");
            case 0 -> System.out.println("Такого часа в сутках нет");
        }*/

    }
}

