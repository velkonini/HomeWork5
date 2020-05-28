public class Employee {
    String name;
    String position;
    String email;
    int phone;
    int salary;
    int age;


    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

}
