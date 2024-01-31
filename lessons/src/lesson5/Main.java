package lesson5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int n, kop;
//        System.out.println("Введите число от 1 до 99: ");
//        n = input.nextInt();
//        kop = n;
//        if (n >= 11 && n <= 14){
//            System.out.println(n + " копеек");
//        } else {
//            kop = kop % 10;
//            if (kop == 1){
//                System.out.println(n + " копейка");
//            } else if(kop >= 2 && kop <= 4){
//                System.out.println(n + " копейки");
//            } else
//        }}


//        int month;
//        int year;
//        int numDays = 0;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//
//        switch (month){
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                numDays = 31;
//                break;
//            case 4: case 6: case 9: case 11:
//                numDays = 30;
//                break;
//            case 2:
//                System.out.print("Введите год: ");
//                year = input.nextInt();
//                if(year % 4 == 0){
//                    numDays = 29;
//                } else {
//                    numDays = 28;
//                }
//                break;
//            default:
//                System.out.println("Такого месяца не существует");
//        }
//        System.out.println("Количество дней: " + numDays);

//        int month;
//
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        String s = switch (month){
//            case 1, 2, 12 -> ("Winter");
//            case 3, 4, 5 -> ("Spring");
//            case 6, 7, 8 -> ("Summer");
//            case 9, 10, 11 -> ("Autumn");
//            default -> ("Такого месяца не существует");
//        };
//        System.out.println(s);
//        input.close();

//        System.out.print("Введите оценку по 12-бальной системе: ");
//        int num = input.nextInt();
//
//        System.out.print("Ваш балл по 5-бальной системе: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0){
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("такого значения нет");
//
//            int i = 0;
//            while (i < 5){
//                System.out.println("i = " + i);
//                i++;
//            }

//        int i = 1;
//        while (i <= 20) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

//        int i = 0;
//
//        while (i < 20){
//            i += 2;
//        System.out.println(i);
//        }

//        int count = 3;
//        int n, sum = 0;
//        while (count > 0) {
//            System.out.println("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//            count--;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//            int n, sum = 0;
//            System.out.println("Введите число: ");
//            while (input.hasNextInt()){
//                System.out.println("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//            }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int a;
//        int b;
//        int sum = 0;
//        System.out.print("Введите начало диапазона: ");
//        a = input.nextInt();
//        System.out.print("Введите начало диапазона: ");
//        b = input.nextInt();
//        while (a <= b){
//            if (a % 2 != 0) {
//                sum += a;
//            }
//            a++;
//        }
//        System.out.println("Сумма чисел: " + sum);

//        int n, orient;
//        System.out.print("Количество символов: ");
//        n = input.nextInt();
//        String symbol;
//        System.out.print("Тип символа: ");
//        symbol = input.next();
//        System.out.print("0 - горизонтальная\n1 - вертикальная\nориентация линии: ");
//        orient = input.nextInt();
//
//        while (n > 0){
//            if (orient == 0){
//                System.out.print(symbol + " ");
//            }else {
//                System.out.println(symbol);
//            }
//            n--;
//        }


//        int i = 1, sum = 0;
//        while (i <= 20) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);

       /* do{
            тело цикла
        }while (условие);*/

//        int i, sum = 0, count = 0;
//        double average;
//        do {
//            System.out.print("Введите число: ");
//            i = input.nextInt();
//            if (i < 0){
//                sum += i;
//                count++;
//            }
//        }
//        while (i != 0) ;
//        average = (double) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f", average);

//        int number, copy, i, reverse_number = 0;
//        System.out.print("Введите число: ");
//        number = input.nextInt();
//        copy = number;
//        do {
////            i = copy % 10;
////            reverse_number = reverse_number * 10 + i;
//            reverse_number *= 10;
//            reverse_number += copy % 10;
//            copy /= 10;
//        }while (copy > 0);
////        System.out.println(reverse_number);
//        System.out.println("Число " + number + (number == reverse_number ? " ": " не ") + "палиндром");


//        int i = 0;
//        while (i < 10){
//            if (i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5)
//            break;
//            i++;
//        }
//        System.out.println("Цикл завершен");

//        int i = 0;
//        while (true){
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//            i++;
//        }

//        int n;
//        while (true){
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0){
//                break;
//            }
//        }

//        int n, pr = 1;
//
//        while (true){
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0){
//                break;
//            }
//            pr = pr * n;
//        }
//        System.out.print("Произведение чисел: " + pr);

//        int n = 5;
//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j <= i) {
//                if (j == 0 || i == j || i == n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                j++;
//            }
//            System.out.println();
//                i++;
//        }

//        System.out.print("Введите начало диапазона: ");
//        int k = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int n = input.nextInt();
//        int[] array = new int[n - k + 1];
//
//        for (int i = 0, j = k; i <= n - k; i++, j++) {
//            array[i] = j;
//            System.out.print(array[i] + "\t");
//        }
//
//        System.out.println("\n" + Arrays.toString(array));

//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length];
//        for (int i=0; i<a1.length; i++){
//            a2[i] = a1[i];
//        }
//        a1[0] = 5;
//        System.out.println("\n" + Arrays.toString(a1));
//        System.out.println("\n" + Arrays.toString(a2));

//        double a = Math.random() * 3; // Math.random() * (max-min) + min;
//        System.out.println(a); // от 2 до 7 не включая 7
//        double b = 2 + Math.random() * 5; // от 2 до 7 (не включительно)
//        System.out.println(b);
//
//        double c = Math.random() * 10 - 5; // от -5 до 5 (не включительно)
//        System.out.println(c);
        // Math.random() * (5-(-5)) + (-5);

//        int a = (int) (Math.random() * 3); // от 0 до 3 не включительно
//        System.out.println(a);
//        int b = (int) (Math.random() * 2 + 3); // от 3 до 5 не включительно
//        System.out.println(b);

//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++){
//            array[i] = (int) (Math.random() * 12 + 2); // от 2 до 14 не включительно
//            array[i] = (int) (Math.random() * 31 - 15); // от -15 до 16
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int [20];
//        int sum = 0, count = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0){
//                count++;
//            } else {
//             sum += array[i];
//            }}
//        System.out.println("Количество четных элементов: " + count);
//        System.out.println("Количество нечетных элементов: " + sum);

//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i > numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
////        for (объявление_переменной : выражение){}
//        for (int x : numbers){
//            System.out.print(++x + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(numbers));

//        String[] names = {"Олег", "Иван","Дима", "Юля"};
//        for (String name: names){
//            System.out.println(name);
//        }

//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};
//        System.out.println(Arrays.toString(cities));
//        String[] cities2 = new String[cities.length + 1];
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//        cities2[cities.length] = "Красноярск";
//        System.out.println(Arrays.toString(cities2));

//        ArrayList <String> cities = new ArrayList<>();
//        cities.add("Брянск");
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Красноярск");
//        cities.add(1,"Армавир");
//        cities.add(1,"Армавир");
//
//        System.out.println(cities.get(2));
//
//        for (String city : cities){
//            System.out.print(city +  " ");
//        }
//
//        System.out.println("\n" + cities.indexOf("Владивосток"));
//
//        cities.remove(1); // удаляет элемент по заданному индексу (может удалять по заданному значению)
//        cities.set(2, "Курск"); // устанавливаем новое значение по заданному индексу
//        for (String city : cities) {
//            System.out.print(city + " ");
//        }
//
//        if (cities.contains("Курск")){ // проверка на существование элемента в массиве ArrayList
//            System.out.println("\nArrayList содержит Курск");
//        }
//        System.out.println(cities.contains("Курск"));
//
//        System.out.println(cities.size());
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }
//        cities.remove("Красноярск");

//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка. Условие выхода 0 или отрицательное число: ");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//
//        }
//
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        for (int m : mas){
//            System.out.print(m + "\t");
//        }


//        int[] array = new int[10];
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
//            if (array[i] > max){
//                max = array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Max: " + max);

//        int max;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//
//        for (int m : mas){
//            System.out.print(m + "\t");
//        }
//        max - mas.get(0);
//
//            for (int i = 0; i < 10; i++) {
//            if (mas.get(i) > max){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
//        ind = mas.indexOf(max);
//        System.out.println("index: " + ind);
//        mas.remove(ind);
//        mas.add(0, max);
//
//        for (int m : mas){
//            System.out.print(m + "\t");
//        }
//
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33));
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }
//        System.out.println(a);
//        System.out.println(b);

//        for (int m : c) {
//            System.out.print(m + "\t");
//        }
//
//        int[][] num = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
//        System.out.println(num.length);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j] + "\t");
//
//
//            }
//            System.out.println();
////
//            int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//            for (int i = 0; i < num.length; i++) {
//                for (int j = 0; j < num[i].length; j++) {
//                    System.out.print(num[i][j] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            for (int i = 0; i < num.length; i++) {
//                for (int j = 0; j < num[i].length; j++) {
//                    System.out.print(num[i][j] * num[i][j] + "\t");
//                }
//                System.out.println();
//            }


//        int n = 5, m = 7;
//        char[][] graph = new char[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++){
//                graph[i][j] = '*';
//                System.out.print(graph[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int n = 3, m = 4, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//            mas[i][j] = (int) (Math.random() * 30 - 20);
//            if (mas[i][j] < 0){
//                count++;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);
//
//        int [] array = new int[10];
//        int c;
//        for (int i = 0; i < array.length; i++) {
//            c = (int) (Math.random() * 10);
//            int j = 0;
//            while (j < i){
//                if (c != array[j]){
//                    j++;
//                } else{
//                    c = (int) (Math.random() * 10);
//                    j = 0;
//                }
//            }
//            array[i] = c;
//        }
//        System.out.println(Arrays.toString(array));
//
//        int sum = Integer.MAX_VALUE;
//        int tmp = 0, n = 0;
//        int arr[][] = new int [3][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() *100 );
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                tmp += arr[i][j];
//            }
//            if (sum > tmp){
//                sum = tmp;
//                n = i;
//            }
//            tmp = 0;
//            System.out.println("Сумма элементов " + (i+1) + " строки " + sum);
//
//        }
//        System.out.println("\nСтрока с минимальной суммой элементов " + sum + ", имеет номер " + (n + 1));
//
//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j]    = input.nextInt();
//            }
//                System.out.println();
//            }
//
//        int[][] mas = new int [3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//
//        int n = 5;
//        int arr[][] = new int[n][];
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = new int[arr.length - i];
//        }
//        int count = 10;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//
//        int n = 5;
//        int tp[][] = new int[n][];
//        for (int i = 0; i < n; i++) {
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j];
//            }
//        }
//
//        for (int i = 0; i < tp.length; i++) {
//            for (int j = 0; j < n - i; j++){
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "   ");
//            }
//            System.out.println();
//        }

        }
    }