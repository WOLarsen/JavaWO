package lesson1;

public class Main {
    public static void main(String[] args) {
/*        System.out.println("Привет Мир!");
        System.out.println("Hello");
        System.out.print("World");
        System.out.print("Hello");*/
        /*int a = 10;
        System.out.println(a);
        int WEEK = 7;
        System.out.println(WEEK);
        WEEK = 9;*/

        //       float a = 8.5F;
        //       System.out.println(a);
        //       double b = 8.5;
        //       System.out.println(b);

//        System.out.println(((Object)512).getClass().getSimpleName());
//        int a = 512;
//        System.out.println(a);
//        long b = 12345678901L;
//        System.out.println(b);

//        int num2 = 0b10010;
//        System.out.println(num2);
//        int num8 = 022;
//        System.out.println(num8);
//        int num16 = 0x12;
//        System.out.println(num16);

//        int x = 123_456_789;
//        System.out.println(x);
//        double y = 243_567.798__102;
//        System.out.println(y);

//        double d1 = 0.512;
//        double d2 = .512;
//        double d3 = 512.;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);

//        String text = "Hello, \nWorld!";
//        System.out.println(text);
//        System.out.println("    Путь к каталогу 'folder' находится D:\\folder\\file.text");
//
//        System.out.print("2 + 2 = 5");
//        System.out.print("\b");
//        System.out.print("4");
//        System.out.print("\r");
//        System.out.print("4");

//        System.out.print("5 + 3 = ");
//        System.out.println(5 + 3);
//        System.out.println("5 + 3 = " + (5 + 3));
//        System.out.printf("5 + 3 = %d", 5 + 3);
//        int a = 5;
//        int b = 6;
//        System.out.printf("a = %d, b = %d %n", a, b);
//        System.out.println("a = " + a + ", b = " + b);

//        String name = "Александр";
//        int age = 25;
//        float height = 1.9F;
//        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %.2f", name, age, height);

    /*    %d - для целочисленных значений
        %s - для строк
        %f - для вещественных чисел
        %c - для отдельного символа (чар)
*/


//        System.out.printf("%8d%n", 123);
//        System.out.printf("%4d%5d%n", 123, 456);
//        System.out.printf("%4d%n", 123456789);
//        System.out.printf("%-6s%5d%n", "num =", 456);



//        System.out.println(5 - 2);
//        System.out.println(5 + 2);
//        System.out.println(5 * 2);
//        System.out.println(5 / 2);
//        System.out.println(5. / 2);
//        System.out.println(5 % 2);


//        int num = 4321;
//        int a, b, c, d, res;
//        System.out.printf("Исходное число: %d %n", num);
//        a = num % 10;
//        System.out.println("a: " + a);
//        num = num / 10;
////        System.out.println(num);
//        b = num % 10;
//        System.out.println("b: " + b);
//        num = num / 10;
////        System.out.println(num);
//        c = num % 10;
//        System.out.println("c: " + c);
//        num = num / 10;
////        System.out.println(num);
//        d = num % 10;
//        System.out.println("d: " + d);
//
//        res = a * 1000 + b * 100 + c * 10 + d;
//        System.out.printf("Обратное число: %d", res);

//        int a = 8;
//        int b = a++;
//        System.out.println(a);
//        System.out.println(b);

//        int a = 1;
//        int b = 1;
//        int c = a++ + 3;
//        int d = ++b + 3;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

//        int a = 2;
//        int b = a++;
//        int c = b + 3 + a;
//        System.out.println(c);

//        int a = 1;
//        int b = 2;
//        int c = a + 5 * ++b;
//        System.out.println(c);


//        System.out.printf("---------------------------------%n");
//        System.out.printf("      JAVA PRIMITIVE TYPES       %n");
//        System.out.printf("---------------------------------%n");
//        System.out.printf("| %-10s | %-8s |  %4s | %n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("---------------------------------%n");
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Floating", "double", 64);
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Floating", "float", 32);
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Integral", "long", 64);
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Integral", "int", 32);
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Integral", "short", 16);
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Integral", "byte", 8);
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Integral", "char", 16);
//        System.out.printf("| %-10s | %-8s |  %04d |%n", "Boolean", "boolean", 1);
//        System.out.printf("---------------------------------%n");

//        int x = 5;
//        byte y = (byte)x; // явное преобразование типов данных
//        System.out.println(y);

//        byte x = 5;
//        int y = x;
//        System.out.println(y);

//        int x = 7654321;
//        float y = x;
//        System.out.println(y);

//        int x = 258;
//        byte y = (byte) x;
//        System.out.println(y);

//        long x = 5;
//        double x = 18.9849;
//        int y = (int)Math.round(x);
//        System.out.println(y);

//        int a, b, c;
//        a = 5;
//        b = 3;
//        c = 7;
//        System.out.printf("Исходные числа: %d, %d, %d %n", a, b, c);
//        int sum = a + b + c;
//        System.out.printf("Сумма чисел: %d %n", sum);
//        int num = a * b * c;
//        System.out.printf("Произведение чисел: %d %n", num);
//        float avrg = (float) sum / 3;
//        System.out.printf("Среднее арифметическое значение: %.2f %n", avrg);

//        int a = 5;
//        double b = 4.7;
//        double c = a + b;
//        System.out.println(c);
//
//        int d = 'a' + 3;
//        System.out.println(d);








    }
}
