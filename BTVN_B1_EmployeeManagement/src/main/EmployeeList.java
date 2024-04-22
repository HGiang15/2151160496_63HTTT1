package main;

import java.util.ArrayList;

public class EmployeeList {
    // DS đối tượng Employee
    private ArrayList<Employee> listEmployees;
    private ArrayList<Employee> defaultEmployees() {
        ArrayList<Employee> defaultEmployees = new ArrayList<>();
        defaultEmployees.add(new Employee("001", "Name1", 30, "HR", "HR001", 50000));
        defaultEmployees.add(new Employee("002", "Name2", 25, "IT", "IT001", 60000));
        defaultEmployees.add(new Employee("003", "Name3", 28, "Finance", "FIN001", 55000));
        defaultEmployees.add(new Employee("004", "Name4", 35, "Marketing", "MARK001", 70000));
        defaultEmployees.add(new Employee("005", "Name5", 27, "Sales", "SALE001", 52000));
        defaultEmployees.add(new Employee("006", "Name6", 32, "Engineering", "ENG001", 65000));
        defaultEmployees.add(new Employee("007", "Name7", 29, "Customer Service", "CUST001", 48000));
        defaultEmployees.add(new Employee("008", "Name8", 31, "Product", "PROD001", 63000));
        defaultEmployees.add(new Employee("009", "Name9", 26, "Supply Chain", "SUPP001", 53000));
        defaultEmployees.add(new Employee("010", "Name10", 34, "Operations", "OPS001", 72000));
        return defaultEmployees;
    }

//    public EmployeeList() {
//        this.listEmployees = new ArrayList<Employee>();
//    }

    public EmployeeList(ArrayList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }

    public EmployeeList() {
        this.listEmployees = defaultEmployees();
    }

    // 1. Them nhan vien
    public void addEmployee(Employee employee) {
        this.listEmployees.add(employee);
    }

    // 2. Hien thi danh sach nhan vien
    public void showListEmployee() {
        for (Employee employee : listEmployees) {
            System.out.println(employee);
        }
    }

    // 3. Xóa 1 nhân viên ra khỏi danh sách theo id

    // - Kiểm tra xem nhân viên có tồn tại trong DS ko để xóa
    public boolean checkEmployee(Employee employee) {
        return this.listEmployees.contains(employee);
    }

    public boolean removeEmployee(Employee employee) {
        return this.listEmployees.remove(employee);
    }
}
