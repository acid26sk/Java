package HW_6;


class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGTH = 2;


    @Override
    void run(int length) {
        System.out.println("Кот: \n");
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("БЕГ: true");
        else System.out.println("БЕГ: false");
    }

    @Override
    void swim(int length) {
        System.out.println("ПЛАВАНИЕ: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("ПРЫЖКИ: true");
        else System.out.println("ПРЫЖКИ: false");
    }
}