public class Main {

    public static void main(String[] args) {
        //Employee employee1 = new Employee("John Wayne", "CEO", "John1@ya.ru", 5555555, 0, 39);

        //employee1.info();


        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Tony Stark", "CEO", "stark@ya.ru", 5555555, 150000, 45);
        employees[1] = new Employee("Steve Rogers", "Captain", "cap@ya.ru", 1111111, 20000, 91);
        employees[2] = new Employee("Bruce Banner", "Scientist", "hulk@ya.ru", 2222222, 15000, 41);
        employees[3] = new Employee("Peter Parker", "Student", "spidey@ya.ru", 3333333, 1000, 21);
        employees[4] = new Employee("Thanos", "Cleaning manager", "balance@ya.ru", 0000000, 0, 1500);


            for(int i = 0; i < employees.length; i++){
                if (employees[i].age >= 40){
                    employees[i].info();
                }

            }
        }

    }


