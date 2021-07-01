package HW_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task1 {
    public static void task1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            Random r = new Random();
            int x = r.nextInt(9);
            int f;
            System.out.println("Компьютер загадал число от 0 до 9. Попробуйте угадать!");
            System.out.println("Введите число!");

            for (int i = 1; i <= 3; i++) {
                f = Integer.parseInt(br.readLine());

                if (f == x) {
                    System.out.println(f + " = " + x + " Вы выйграли!");
                    break;
                } else if (f > x) System.out.println("Ваше число больше");
                else System.out.println("Ваше число меньше");

                if (i == 3) System.out.println("Вы проиграли! загаданное число: " + x);
            }

            System.out.println("Хотите сыграть ещё раз? 1 - ДА / 0 - НЕТ");

            int repeat = Integer.parseInt(br.readLine());
            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("Введите корректное число: 1 - ДА / 0 - НЕТ");
                repeat = Integer.parseInt(br.readLine());
            }

            if (repeat == 1) {
                System.out.println("Запуск новой игры...");
            } else {
                System.out.println("До свидания!");
                return;
            }
        } while (true);
    }


}