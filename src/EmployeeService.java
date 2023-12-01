public class EmployeeService {
    public EmployeeService() {
    }

    public static Employee[] createEmployees() {
        Employee[] employeesArr = new Employee[10];
        employeesArr[0] = new Employee("Малышев Ростислав Николаевич", 1, 30_000);
        employeesArr[1] = new Employee("Лебедева Кристина Анатольевна", 1, 100_000);
        employeesArr[2] = new Employee("Малышева Елена Ивановна", 1, 111_000);
        employeesArr[3] = new Employee("Малышев Самир Александрович", 1, 60_000);
        employeesArr[4] = new Employee("Галицкий Вячеслав Витальевич", 1, 55_000);
        employeesArr[5] = new Employee("Львов Павел Дмитриевич", 3, 25_000);
        employeesArr[6] = new Employee("Базылева Софья Сергеевна", 4, 27_000);
        employeesArr[7] = new Employee("Кононов Дмитрий Константинович", 5, 13_000);
        employeesArr[8] = new Employee("Кононова Ангелина Сергеевна", 5, 100_000);
        employeesArr[9] = new Employee("Машель Сергей Михайлович", 2, 228_000);
        for (int i = 0; i < employeesArr.length; i++) {
            employeesArr[i].setCounter(i++);
        }
        return employeesArr;
    }


    public static void printAllEmployeesInfo(Employee[] employeesArr) {
        for (int i = 0; i < employeesArr.length; i++) {
            System.out.println(employeesArr[i]);
        }
    }

    public static void printAllEmployeesName(Employee[] employeesArr) {
        for (int i = 0; i < employeesArr.length; i++) {
            System.out.println(employeesArr[i].getFullname());
        }
    }

    public static double calcAverageSalary(Employee[] employeesArr) {
        int sum = 0;
        for (Employee employee : employeesArr) {
            sum += employee.getSalary();
        }
        double averageSalary = sum / employeesArr.length;
        return averageSalary;
    }

    public static int calcSalaryCosts(Employee[] employeesArr) {
        int sum = 0;
        for (int i = 0; i < employeesArr.length; i++) {
            sum += employeesArr[i].getSalary();
        }
        return sum;
    }

    public static Employee minimalEmployeeSalary(Employee[] employeesArr) {
        Employee minimalSalaryEmployeer = employeesArr[0];
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getSalary() < minimalSalaryEmployeer.getSalary()) {
                minimalSalaryEmployeer = employeesArr[i];
            }
        }
        return minimalSalaryEmployeer;
    }

    public static Employee maximalEmployeeSalary(Employee[] employeesArr) {
        Employee maximalSalaryEmployeer = employeesArr[0];
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getSalary() > maximalSalaryEmployeer.getSalary()) {
                maximalSalaryEmployeer = employeesArr[i];
            }
        }
        return maximalSalaryEmployeer;
    }


    public static void increaseSalary(Employee[] employeesArr, int increment) {
        int i = 0;
        for (; i < employeesArr.length; i++) {
            int salaryIncrease = (employeesArr[i].getSalary() * increment / 100) + employeesArr[i].getSalary();
            employeesArr[i].setSalary(salaryIncrease);
            System.out.println("Зарплаты всех работников после индексации стали: " + employeesArr[i].getFullname() + ": " + employeesArr[i].getSalary());
        }
    }

    public static Employee getDepartmentMinSalaryEmployee(int department, Employee[] employeesArr) {

        Employee minSalaryEmployee = null;
        int minSalary = Integer.MAX_VALUE;

        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == department &&
                    employee.getSalary() < minSalary) {

                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }

        return minSalaryEmployee;
    }

    public static Employee getDepartmentMaxSalaryEmployee(int department, Employee[] employeesArr) {
        Employee maxSalaryEmployee = null;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getDepartment() == department && employeesArr[i].getSalary() > maxSalary) {
                maxSalary = employeesArr[i].getSalary();
                maxSalaryEmployee = employeesArr[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static double getCostDepartmentSalary(int department, Employee[] employeesArr) {
        int sum = 0;
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getDepartment() == department) {
                sum += employeesArr[i].getSalary();
            }
        }
        return sum;
    }

    public static void printIncreaseDepartmentSalary(int department, Employee[] employeesArr, int increment) {
        int i = 0;
        for (; i < employeesArr.length; i++) {
            int salaryIncrease = 0;
            if (employeesArr[i].getDepartment() == department) {
                salaryIncrease = (employeesArr[i].getSalary() * increment / 100) + employeesArr[i].getSalary();
                employeesArr[i].setSalary(salaryIncrease);
                System.out.println("Зарплаты в отделе после индексации стали: " + employeesArr[i].getFullname() + ": " + employeesArr[i].getSalary());
            }
        }
    }

    public static void printDepartmentEmployeesNames(int department, Employee[] employeesArr) {
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getDepartment() == department) {
                System.out.println("id: " + employeesArr[i].getId() + " ФИО: " + employeesArr[i].getFullname() + " Зарплата: " + employeesArr[i].getSalary());
            }
        }
    }

    public static void printIsSalaryBigger(int number, Employee[] employeesArr) {
        System.out.println("Сотрудники, чья зарплата ниже числа: ");
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getSalary() < number) {
                System.out.println(employeesArr[i].getId() + " " + employeesArr[i].getFullname() + " " + employeesArr[i].getSalary());
            }
        }
        System.out.println();
        System.out.println("Сотрудники, чья зарплата выше или равна числу: ");
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getSalary() >= number) {
                System.out.println(employeesArr[i].getId() + " " + employeesArr[i].getFullname() + " " + employeesArr[i].getSalary());
            }
        }
    }


}




