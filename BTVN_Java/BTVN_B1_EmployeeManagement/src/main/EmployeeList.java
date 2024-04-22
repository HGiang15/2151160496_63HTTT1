package main;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> listEmployees;

    public EmployeeList() {
        this.listEmployees = new ArrayList<Employee>();
    }

    public EmployeeList(ArrayList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
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

    // 3. Xóa 1 nhân viên ra khỏi danh sách theo id nhân viên

    // - Kiểm tra xem nhân viên có tồn tại trong DS ko để xóa
    public boolean checkEmployee(Employee employee) {
        return this.listEmployees.contains(employee);
    }

    public boolean removeEmployee(Employee employee) {
        return this.listEmployees.remove(employee);
    }
}
