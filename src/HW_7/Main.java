package HW_7;

public class Main {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Матроскин", 7), new Cat("Том", 5), new Cat("Бен", 15)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("увеличит еду на 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Кошки берут еду:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
