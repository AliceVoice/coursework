public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Малышев Ростислав Николаевич", 1, 30_000);
        employeeBook.addEmployee("Лебедева Кристина Анатольевна", 1, 100_000);
        employeeBook.addEmployee("Малышева Елена Ивановна", 1, 111_000);
        employeeBook.addEmployee("Малышев Самир Александрович", 1, 60_000);
        employeeBook.addEmployee("Галицкий Вячеслав Витальевич", 1, 55_000);
        employeeBook.addEmployee("Львов Павел Дмитриевич", 3, 25_000);
        employeeBook.addEmployee("Базылева Софья Сергеевна", 4, 27_000);
        employeeBook.addEmployee("Кононов Дмитрий Константинович", 5, 13_000);
        employeeBook.addEmployee("Кононова Ангелина Сергеевна", 5, 100_000);
        employeeBook.addEmployee("Машель Сергей Михайлович", 2, 228_000);

        employeeBook.printAllEmployeesInfo();
        employeeBook.printAllEmployeesName();

        System.out.println("Затраты на зарплаты: " + employeeBook.calcSalaryCosts());
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.minimalEmployeeSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.maximalEmployeeSalary());
        System.out.println("Средняя зарплата составляет: " + employeeBook.calcAverageSalary());
        employeeBook.printAllEmployeesName();

        employeeBook.increaseSalary(10);
        System.out.println("Сотрудник с минимальной зарплатой в отделе: " + employeeBook.getDepartmentMinSalaryEmployee(1));
        System.out.println("Сотрудник с максимальной зарплатой в отделе: " + employeeBook.getDepartmentMaxSalaryEmployee(2));
        System.out.println("Сумма затрат на зарплату в отделе: " + employeeBook.getCostDepartmentSalary(4));
        employeeBook.printIncreaseDepartmentSalary(1, 10);
        employeeBook.printDepartmentEmployeesNames(1);
        employeeBook.printIsSalaryBigger(30000);
        employeeBook.changeEmployeeSalary("Лебедева Кристина Анатольевна", 800_000);
        employeeBook.printEachDepartmentEpmloyees();
        employeeBook.removeEmployeeId(1);

    }
}
