public class Main {

    public static void main(String[] args) {
        Employee[] employeesArr = EmployeeService.createEmployees();

        EmployeeService.printAllEmployeesInfo(employeesArr);
        System.out.println("Затраты на зарплаты: " + EmployeeService.calcSalaryCosts(employeesArr));
        System.out.println("Сотрудник с минимальной зарплатой: " + EmployeeService.minimalEmployeeSalary(employeesArr));
        System.out.println("Сотрудник с максимальной зарплатой: " + EmployeeService.maximalEmployeeSalary(employeesArr));
        System.out.println("Средняя зарплата составляет: " + EmployeeService.calcAverageSalary(employeesArr));
        EmployeeService.printAllEmployeesName(employeesArr);

        EmployeeService.increaseSalary(employeesArr, 10);
        System.out.println("Сотрудник с минимальной зарплатой в отделе: " + EmployeeService.getDepartmentMinSalaryEmployee(1, employeesArr));
        System.out.println("Сотрудник с максимальной зарплатой в отделе: " + EmployeeService.getDepartmentMaxSalaryEmployee(2, employeesArr));
        System.out.println("Сумма затрат на зарплату в отделе: " + EmployeeService.getCostDepartmentSalary(4, employeesArr));
        EmployeeService.printIncreaseDepartmentSalary(1, employeesArr, 10);
        EmployeeService.printDepartmentEmployeesNames(1, employeesArr);
        EmployeeService.printIsSalaryBigger(30000, employeesArr);
    }
}
