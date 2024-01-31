package lesson6;
import java.time.DayOfWeek;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

//        float num = 5.25f;

//        System.out.println(Math.PI);
//        System.out.println(Math.round(num)); // округление по математике
//        System.out.println(Math.ceil(num)); // округление вверх
//        System.out.println(Math.floor(num)); // округление вниз
//        System.out.println(Math.sqrt(4)); // корень квадратный
//        System.out.println(Math.pow(4, 2)); // возведение в степень, число потом степень
//        System.out.println(Math.pow(4, 4)); // возведение в степень, число потом степень
//
//
//        System.out.print("Введите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длина окружности: , %.2f", 2 * Math.PI * radius);
//
//        System.out.print("Введите два катета треугольника: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.print("Катет 1: " + a);
//        System.out.print("Катет 2: " + b);
//        System.out.print("Гипотенуза: " + Math.sqrt(a * a + b * b));
//
//        Date current = new Date(123, 2, 21, 12, 15, 0);
//        System.out.println(current);
//        System.out.println(current.getYear());
//        System.out.println(current.getMonth());
//        current.setMonth(5);
//        System.out.println(current);
//
//        sum(1, 2, 3);
//        sum(1, 2, 3, 4, 5);
//        sum();
//        sum(10,"Welcome!", "20");
//        sum(1,"Hello World!", "a", "b");
//
//    }
//
//    public static void sum(int nums, String... message){
//        System.out.println(message);
//        int res = 0;
//        for(int n: nums){
//            res += n;
//        }
//        for (String s: message){
//            System.out.println(s);
//        }
//        System.out.println(res);
//
//
//        func_num(2, 7, 0, 3, 1, 5, -13);
//        func_num(2, 7, 0, 3, 1, 5, -13, 13);
//        func_num(26);
//        func_num(99, 99, 100, 34, -93);
//        func_num(99, 39, 99, 100, 34);
//    }
//
//        public static  void func_num(int... args){
//            int max = args[0];
//            for(int i : args) {
//                if (i % 13 == 0 && i > 0) {
//                    max = i;
//                }
//                }
//                if (args[0] % 13 != 0 && max == args[0]){ ;
//                System.out.println("Число не найдено");
//                }
//                else{
//            System.out.println(max);
//
//        }
//
//        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8));
//        System.out.println(ch(2, 4, 6, 8, 10, 12, 14, 16));
//    }
//
//    public static ArrayList ch(int... args) {
//        ArrayList<Integer> mas = new ArrayList<>();
//        int sum = 0;
//        int count = 0;
//        double average;
//        for(int i : args){
//            sum += i;
//            count += 1;
//        }
//        average = (double) sum / count;
//        System.out.println("Среднее арифметическое: " + average);
//        for (int i : args){
//            if (i < average){
//                mas.add(i);
//            }
//        }
//        return mas;
//
//        int a = 7;
//        int b = 3;
//        double c = 5.1;
//        double d = 7.2;
//        int res1 = min(a, b);
//        System.out.println(res1);
//        double res2 = min(c, d);
//        System.out.println(res2);
//    }
//        public static int min(int n1, int n2){
//        int min;
//        if (n1 > n2)
//            min = n2;
//        else
//            min = n1;
//        return  min;
//    }
//    public static double min(double n1, double n2) {
//        double min;
//        if (n1 > n2)
//            min = n2;
//        else
//            min = n1;
//        return min;
//
//        int num = 4;
//        String str = "2 x 2 =";
//        print(str);
//        print(num);
//        print(str, num);
//    }
//
//    public static void print(String text) {
//        System.out.println(text);
//    }
//
//        public static void print(int number) {
//            System.out.println(number);
//        }
//
//            public static void print(String text, int number) {
//                System.out.println(text + " " + number);
//            }
//
//        int a = 7;
//        int b = 3;
//        int c = 5;
//        int res1 = sum(a, b);
//        int res2 = sum(a, b, c);
//        System.out.println("Сумма двух чисел: " + res1);
//        System.out.println("Сумма трех чисел: " + res2);
//    }
//
//    public static int sum(int n1, int n2){
//        int sum = n1 + n2;
//        return sum;
//    }
//    public static int sum(int n1, int n2, int n3){
//        int sum = n1 + n2 + n3;
//        return sum;
//    }
//
//
//        double num1 = getNumber();
////        System.out.println("num: " + num1);
//        double num2 = getNumber();
////        System.out.println("num: " + num2);
//        char operation = getOperation();
////        System.out.println(operation);
//        double result = calc(num1, num2, operation);
//        System.out.println("Результат: " + result);
//    }
//
//    public static double calc(double num1, double num2, char operation){
//        switch (operation){
//            case '+':
//                return add(num1, num2);
//            case '-':
//                return sub(num1, num2);
//            case '*':
//                return mul(num1, num2);
//            case '/':
//                return div(num1, num2);
//            default:
//                return Double.NaN;
//        }
//    }
//
//    public static double add(double num1, double num2){
//        return num1 + num2;
//    }
//    public static double sub(double num1, double num2){
//        return num1 - num2;
//    }
//    public static double mul(double num1, double num2){
//        return num1 * num2;
//    }
//    public static double div(double num1, double num2) {
//        if (num2 != 0.0) {
//            return num1 / num2;
//        } else {
//            System.out.println("На ноль делить нельзя!");
//            return Double.NaN;
//        }
//    }
//
//        public static double getNumber () {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Введите число: ");
//            if (input.hasNextDouble()) {
//                return input.nextDouble();
//            } else {
//                System.out.println("Ошибка при вводе. Повторите ввод.");
//                return getNumber();
//            }
//        }
//        public static char getOperation () {
//            Scanner input = new Scanner(System.in);
//            System.out.print("1 - сумма\n2 - разность\n3 - произведение\n4 - частное\nВыберите номер операции: ");
//            int operationNumber = 0;
//            if (input.hasNextInt()) {
//                operationNumber = input.nextInt();
//            } else {
//                System.out.println("Вы ввели не число. Повторите ввод.");
//                return getOperation();
//            }
//            switch (operationNumber) {
//                case 1:
//                    return '+';
//                case 2:
//                    return '-';
//                case 3:
//                    return '*';
//                case 4:
//                    return '/';
//                default:
//                    System.out.println("Неправильная операция. Повторите ввод.");
//                    return getOperation();
//            }

//        System.out.println("На каком Вы этаже: ");
//        int n1 = input.nextInt();
//        elevator(n1);
//    }
//
//    public static void elevator(int n){
//        if(n == 0){
//            System.out.println("Вы в подвале");
//            return;
//        }
//
//        System.out.println("=> " + n);
//        elevator(n - 1);
//        System.out.print(n + " ");
//    }
//
//
//        int[] mas = {1, 3, 5, 7, 9};
////        System.out.println(sumList(mas));
//    }
//
//    public static int sumList(int i, int[] arr){
//        if(i == (arr.length - 1)){
//            return arr[i];
//        }
//        return arr[i] + sumList(i + 1, arr);
//    }
//
//    public static int sumList(int[] arr){
//        int sum = 0;
//        for (int i: arr){
//            sum += i;
//        }
//        return sum;
//
//
//        System.out.println(toStr(254, 16));
//    }
//
//    public static String toStr(int n, int base){
//        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9","A", "B", "C", "D", "E", "F"};
//        if (n < base){
//            return convert[n];
//        } else {
//            return toStr(n / base, base) + convert[n % base];
//        }
//
//        int size;
//        System.out.print("Введите размер массива: ");
//        size = input.nextInt();
//        int[] List = new int[size];
//
//        int option;
//        do {
//            System.out.println("Меню: ");
//            System.out.println("1. Ввод элементов массива: ");
//            System.out.println("2. Отображение массива: ");
//            System.out.println("3. Поиск элементов в массиве: ");
//            System.out.println("4. Сортировка массива: ");
//            System.out.println("5. Выход: ");
//            System.out.print("Сделайте свой выбор: ");
//            option = input.nextInt();
//
//            switch (option){
//                case 1:
//                    readArray(List);
//                    break;
//                case 2:
//                    displayArray(List);
//                    break;
//                case 3:
//                    System.out.print("Введите элемент, который вы хотите найти: ");
//                    int item = input.nextInt();
//                    int index = searchArray(List, item);
//                    if (index == -1){
//                        System.out.println("Элемент не найден");
//                    }else {
//                        System.out.println("Элемент найден на позиции " + index);
//                    }
//                    break;
//                case 4:
//                    System.out.println("Отсортированный массив:");
//                    sortArray(List);
//                    displayArray(List);
//                    break;
//            }
//        }while (option != 5);
//    }
//
//    public static void readArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//    }
//
//    public static void displayArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static int searchArray(int[] array, int data){
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == data){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void sortArray(int[] array){
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//
//        }
//    }
//
//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        }catch (InputMismatchException w){
//            System.out.println("Вы ввели не целое число");
//        }
//
//        String str = "Замените в этой строке все появления буквы \"о\" на букву \"О\", кроме первого и последнего вхождения.";
//        System.out.println(str);
//        String a = str.substring(0, str.indexOf("о") + 1);
//        System.out.println(str.lastIndexOf("о"));
//        String b = str.substring(str.indexOf("о") + 1, str.lastIndexOf("о"));
//        String c = str.substring(str.lastIndexOf("о"));
//        System.out.println(a + b.replace("о", "О" + c));
//
//
//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = "HELLO";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s3));
//
//
//        System.out.println("I learning Java".endsWith("Java"));
//        System.out.println("I learning Java".startsWith("I"));
//        System.out.println("I learning Java".contains("learning"));
//
//
//        System.out.print("Введите название документа: ");
//        String path = input.nextLine();
//
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png")){
//            System.out.println("Это изображение");
//        } else if (path.endsWith(".docx") || path.endsWith(".doc")) {
//            System.out.println("Это документ Word");
//        } else {
//            System.out.println("Неизвестный формат");
//        }
//
//
//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(5);
//        System.out.println(n);
//
//        n = s.codePointBefore(5);
//        System.out.println(n);
//
//
//        String s;
//
////        double d = 3.8567;
////        int d = -3902;
////        char d = '+';
//        boolean d = true;
//        s = String.valueOf(d);
//        System.out.println(s);
//
//
//        String str = "1";
//        System.out.println("1 > 2 : " + str.compareTo("2"));
//        str = "2";
//        System.out.println("1 > 2 : " + str.compareTo("1"));
//        System.out.println("2 == 2 : " + str.compareTo("2"));
//
//        String str = "a";
//        System.out.println("a > m : " + str.compareTo("m"));
//        str = "m";
//        System.out.println("a > m : " + str.compareTo("a"));
//        System.out.println("m == m : " + str.compareTo("m"));
//
//        String str = "A";
//        System.out.println("A > m : " + str.compareToIgnoreCase("m"));
//        str = "m";
//        System.out.println("A > m : " + str.compareToIgnoreCase("A"));
//        System.out.println("m == m : " + str.compareToIgnoreCase("m"));
//
//
//        StringBuilder sb = new StringBuilder();
////        sb.append('a');
////        sb.append(10);
////        sb.append(123456L);
////        sb.append(12.34);
////        sb.append(12.34f);
//        sb.append("Hello")
//                .append("_")
//                .append("World");
//        System.out.println(sb);
//        sb.insert(5, "_!");
//        System.out.println(sb);
//        sb.delete(5, 7);
//        System.out.println(sb);
//        sb.replace(5, 10, "Java");
//        System.out.println(sb);
//        String st = sb.substring(5, 6);
//        System.out.println(st);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.indexOf("l"));
//        System.out.println(sb.indexOf("l", 7));
//
//
//        StringBuilder sb1 = createStr(5, 3);
//        modifyStr(sb1, "=", "равно ");
//        modifyStr(sb1, "+", "плюс ");
//        modifyStr(sb1, "-", "минус ");
//        modifyStr(sb1, "*", "умножить ");
//        System.out.println(sb1);
//    }
//
//    public static StringBuilder createStr(int a, int b) {
//        StringBuilder res = new StringBuilder();
//        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
//        res.append(a).append(" - ").append(b).append(" = ").append(a + b).append("\n");
//        res.append(a).append(" * ").append(b).append(" = ").append(a + b).append("\n");
//        return res;
//    }
//
//    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr) {
//        int pos;
//        while ((pos = stBuild.indexOf(oldStr)) != -1) {
//            stBuild.deleteCharAt(pos);
//            stBuild.replace(pos, pos + 1, newStr);
//        }
//        return stBuild;


        StringBuilder modStr = getStringBuilder();
        System.out.println("Измененная строка - \"" + modStr + "\"");
    }

    public static StringBuilder getStringBuilder(){
        System.out.print("Исходная строка - \"" );
        String str = " Текст с повторяющимися   символами ";
        System.out.println(str + "\"");
        StringBuilder modify = new StringBuilder(str.replace(" ", ""));
        for (int i = 0; i < modify.length(); i++) {
            for (int j = modify.length() -1; j > i; j--) {
                if (modify.charAt(i) == modify.charAt(j)){
                    modify.deleteCharAt(j);
                }
            }
        }
        return modify;
    }
}






