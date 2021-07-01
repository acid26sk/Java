package HW_3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        while (true) {
            printIf();
            switch (in.next()) {
                case "1":
                    Task1 cl = new Task1();
                    cl.task1();
                    break;
                case "2":
                    Task2 cl1 = new Task2();
                    cl1.task2();
                    break;
                case "0":
                    doExit();
                default:
                    System.out.println("Попробуйте еще раз");
            }
        }
    }

    public static void printIf() {
        System.out.println("\nВыберите задание:");
        System.out.println("1. Угадай число");
        System.out.println("2. Угадай слово");
        System.out.println("0. Выход");

    }

    private static void doExit() {
        System.out.println("Вы уверены??? y/n");
        if (in.next().equals("y")) {
            System.exit(0);
        }
    }

}
