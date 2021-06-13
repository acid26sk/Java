/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.
4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
package HW_1;


import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        name();
        dataType();
        calculate();
        System.out.println(task10and20());
        isPositiveOrNegative();
        System.out.println(isNegative());
        year();
        System.out.println("\n***СПАСИБО ЗА ПРОВЕРКУ***");
    }


    public static void dataType() {
        byte num_1 = 9;
        short num_2 = 999;
        int num_3 = 23675;
        long num_4 = 234675;
        float num_5 = 641;
        double num_6 = 6.18;
        char chr = 128;
        boolean wood = true;


        System.out.println("ЗАДАНИЕ №2 \nСоздать переменные всех типов пройденных данных и инициализировать их значения.\n \n" +
                "byte: " + num_1 + " - 8-битное знаковое целое число (от -128 до 127)\n" +
                "short: " + num_2 + " - 16-битное знаковое целое число (от -32768 до 32767)\n" +
                "int: " + num_3 + " - 32-битное знаковое целое число (от -2147483648 до 2147483647)\n" +
                "long: " + num_4 + " - 64-битное знаковое целое число (от -9223372036854775808 до 9223372036854775807)\n" +
                "float: " + num_5 + " - 32-битное знаковое число с плавающей запятой одинарной точности\n" +
                "double: " + num_6 + " - 64-битное знаковое число с плавающей запятой двойной точности\n" +
                "char: " + chr + " - 16-битный тип данных, предназначенный для хранения символов в кодировке Unicode (от u0000 или 0 до uffff или 65,535)\n" +
                "boolean: " + wood + " - логический тип данных (false, true)");


    }


    public static void calculate() {
        Scanner add = new Scanner(System.in);
        System.out.println("\nЗАДАНИЕ №3 \nНаписать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, \n" +
                "где a, b, c, d – аргументы этого метода, имеющие тип float.\n \nВведите число a:");
        float a = add.nextInt();
        System.out.println("Введите число b:");
        float b = add.nextInt();
        System.out.println("Введите число c:");
        float c = add.nextInt();
        System.out.println("Введите число d:");
        float d = add.nextInt();
        if (d == 0) {
            throw new RuntimeException("Нельзя делить на ноль!");
        } else {
            System.out.print("Результат вычислений по формуле a*(b+(c/d)) равен: " + (a * (b + (c / d))) + "\n");
        }


    }


    public static boolean task10and20() {
        Scanner add1 = new Scanner(System.in);
        System.out.println("\nЗАДАНИЕ №4 \nНаписать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит \n" +
                "в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.\n \nВведите первое число:");
        int x1 = add1.nextInt();
        System.out.println("Введите второе число:");
        int x2 = add1.nextInt();
        int x = x1 + x2;
        return x >= 10 && x <= 20;


    }


    public static void isPositiveOrNegative() {
        Scanner add2 = new Scanner(System.in);
        System.out.println("\nЗАДАНИЕ №5 \nНаписать метод, которому в качестве параметра передается целое число, метод должен напечатать \n" +
                "в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.\n \nВведите число:");
        int s = add2.nextInt();
        if (s <= 0) {
            System.out.println("Ваше число отрицательное");
        } else {
            System.out.println("Ваше число положительное");
        }
    }


    public static boolean isNegative() {
        Scanner add3 = new Scanner(System.in);
        System.out.println("\nЗАДАНИЕ №6 \nНаписать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,\n" +
                "если число отрицательное, и вернуть false если положительное.\n \nВведите ваше число:");
        int q = add3.nextInt();
        return q<0;
    }


    public static void name() {
        Scanner add4 = new Scanner(System.in);
        System.out.println("\nЗАДАНИЕ №7 \nНаписать метод, которому в качестве параметра передается строка, обозначающая имя.\n" +
                "Метод должен вывести в консоль сообщение «Привет, указанное_имя!».\n \nВведите ваше имя:");
        String n = add4.nextLine();
        System.out.println("Здравствуй " + n + "\n");
        System.out.println("Проверь пожалуйста моё домашнее задание.\n");
    }

    public static void year() {
        Scanner add5 = new Scanner(System.in);
        System.out.println("\nЗАДАНИЕ №8 \n*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.\n" +
                "Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.\n \nВведите год:");
        int y = add5.nextInt();
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

}






