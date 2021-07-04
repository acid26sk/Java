package HW_6;

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private final double MAX_JUMP_HEIGTH = 0.5;

    @Override
    void run(int length) {
        System.out.println("\nСобака: \n");
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("БЕГ: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("ПЛАВАНИЕ: true");
        else System.out.println("ПЛАВАНИЕ: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("ПРЫЖКИ: true");
        else System.out.println("ПРЫЖКИ: false");
    }
}