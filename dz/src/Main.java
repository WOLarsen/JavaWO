import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пятизначное число: ");
        int num = input.nextInt();
        System.out.printf("Вы ввели число: %d", num);
        if (num > 100_000)||(num <= 9_999){
            System.out.println("Число больше допустимого");
            System.out.println("Введите другое число");

        }

        input.close();




    /*int a = 1;
    int b = 2;

        System.out.println(a);
        System.out.println(b);

    a = a + b; // 3
    b = a - b; // 1
    a = a - b; // 2

        System.out.println(a);
        System.out.println(b);

        int c = 10; // проверяю на других числах
        int d = 15;

        System.out.println(c);
        System.out.println(d);

        c = c + d; // 10+15=25
        d = c - d; // 25-15=10
        c = c - d; // 25-10=15

        System.out.println(c);
        System.out.println(d);*/




    }
}
