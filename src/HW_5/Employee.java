package HW_5;

class Employee {
    String firstname, name, middlename, position, email, phone;
    int salary, age;

    Employee(String firstname,
             String name,
             String middlename,
             String position,
             String email,
             String phone,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("фамилия: " + firstname + " | имя: " + name
                + " | отчество: " + middlename + " | должность: " + position
                + " | email: " + email + " | телефон: " + phone + " | зарплата: " + salary + " | возраст: "
                + age);
    }

    int getAge() {
        return age;
    }
}