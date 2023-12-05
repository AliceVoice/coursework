public class Main {

    public static void main(String[] args) {
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
        EmployeeService employeeService = new EmployeeService();
        employeeService.printAllEmployeesInfo(employeesArr);
        employeeService.printAllEmployeesName(employeesArr);


        System.out.println("Затраты на зарплаты: " + employeeService.calcSalaryCosts(employeesArr));
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeService.minimalEmployeeSalary(employeesArr));
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeService.maximalEmployeeSalary(employeesArr));
        System.out.println("Средняя зарплата составляет: " + employeeService.calcAverageSalary(employeesArr));
        employeeService.printAllEmployeesName(employeesArr);

        employeeService.increaseSalary(employeesArr, 10);
        System.out.println("Сотрудник с минимальной зарплатой в отделе: " + employeeService.getDepartmentMinSalaryEmployee(1, employeesArr));
        System.out.println("Сотрудник с максимальной зарплатой в отделе: " + employeeService.getDepartmentMaxSalaryEmployee(2, employeesArr));
        System.out.println("Сумма затрат на зарплату в отделе: " + employeeService.getCostDepartmentSalary(4, employeesArr));
        employeeService.printIncreaseDepartmentSalary(1, employeesArr, 10);
        employeeService.printDepartmentEmployeesNames(1, employeesArr);
        employeeService.printIsSalaryBigger(30000, employeesArr);
    }
}
