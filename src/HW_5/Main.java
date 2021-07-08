package HW_5;

class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов", "Иван", "Иванович",
                "Руководидель", "ivanov@mail.ru", "+7-928-551-41-41", 150000, 46);
        employees[1] = new Employee("Мачнев", "Александр", "Иванович",
                "менеджер", "machnev@mail.ru", "+7-988-458-62-54", 50000, 32);
        employees[2] = new Employee("Чернов", "Сергей", "Георгиевич",
                "менеджер", "chernov@mail.ru", "+7-966-784-65-48", 35000, 27);
        employees[3] = new Employee("Квашин", "Василий", "Дмитриевич",
                "менеджер", "kvashin@mail.ru", "+7-962-231-12-45", 65000, 45);
        employees[4] = new Employee("Полянский", "Олег", "Сергеевич",
                "менеджер", "polyanski@mail.ru", "+7-919-458-78-98", 30000, 28);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}
