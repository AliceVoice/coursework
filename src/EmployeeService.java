public class EmployeeService {
    public EmployeeService() {
    }

    public void printAllEmployeesInfo(Employee[] employeesArr) {
        for (int i = 0; i < employeesArr.length; i++) {
            System.out.println(employeesArr[i]);
        }
    }

    public void printAllEmployeesName(Employee[] employeesArr) {
        for (int i = 0; i < employeesArr.length; i++) {
            System.out.println(employeesArr[i].getFullname());
        }
    }

    public double calcAverageSalary(Employee[] employeesArr) {
        int sum = 0;
        for (Employee employee : employeesArr) {
            sum += employee.getSalary();
        }
        double averageSalary = sum / employeesArr.length;
        return averageSalary;
    }

    public int calcSalaryCosts(Employee[] employeesArr) {
        int sum = 0;
        for (int i = 0; i < employeesArr.length; i++) {
            sum += employeesArr[i].getSalary();
        }
        return sum;
    }

    public Employee minimalEmployeeSalary(Employee[] employeesArr) {
        Employee minimalSalaryEmployeer = employeesArr[0];
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getSalary() < minimalSalaryEmployeer.getSalary()) {
                minimalSalaryEmployeer = employeesArr[i];
            }
        }
        return minimalSalaryEmployeer;
    }

    public Employee maximalEmployeeSalary(Employee[] employeesArr) {
        Employee maximalSalaryEmployeer = employeesArr[0];
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getSalary() > maximalSalaryEmployeer.getSalary()) {
                maximalSalaryEmployeer = employeesArr[i];
            }
        }
        return maximalSalaryEmployeer;
    }


    public void increaseSalary(Employee[] employeesArr, int increment) {
        int i = 0;
        for (; i < employeesArr.length; i++) {
            int salaryIncrease = (employeesArr[i].getSalary() * increment / 100) + employeesArr[i].getSalary();
            employeesArr[i].setSalary(salaryIncrease);
            System.out.println("Зарплаты всех работников после индексации стали: " + employeesArr[i].getFullname() + ": " + employeesArr[i].getSalary());
        }
    }

    public Employee getDepartmentMinSalaryEmployee(int department, Employee[] employeesArr) {

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

    public Employee getDepartmentMaxSalaryEmployee(int department, Employee[] employeesArr) {
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

    public double getCostDepartmentSalary(int department, Employee[] employeesArr) {
        int sum = 0;
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getDepartment() == department) {
                sum += employeesArr[i].getSalary();
            }
        }
        return sum;
    }

    public void printIncreaseDepartmentSalary(int department, Employee[] employeesArr, int increment) {
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

    public void printDepartmentEmployeesNames(int department, Employee[] employeesArr) {
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getDepartment() == department) {
                System.out.println("id: " + employeesArr[i].getId() + " ФИО: " + employeesArr[i].getFullname() + " Зарплата: " + employeesArr[i].getSalary());
            }
        }
    }

    public void printIsSalaryBigger(int number, Employee[] employeesArr) {
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




