package test;

import main.Employee;
import main.EmployeeList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeList listEmployee = new EmployeeList();
        int select = 0;
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/HGiang15/2151160496_63HTTT1.git
//        git push -u origin main
        do {
            System.out.println("------------------ Lựa chọn ------------------");
            System.out.println("-----> Vui lòng chọn chức năng bên dưới (1, 2, 3, 4 0)");
            System.out.println(
                    "-> 1. Thêm nhân viên vào danh sách. \n"
                            + "-> 2. In danh sách nhân viên ra màn hình. \n"
                            + "-> 3. Xóa 1 nhân viên ra khỏi danh sách theo id nhân viên.\n"
                            + "-> 4. Kiểm tra xem nhân viên có tồn tại trong DS ko để xóa.\n"
                            + "-> 0. Thoát chương trình"
            );

            select = sc.nextInt();
            sc.nextLine();

            if (select == 1) {
//				1. Thêm nhân viên vào danh sách
                System.out.print("Nhập id nhân viên: "); String id = sc.nextLine();
                System.out.print("Nhập tên nhân viên: "); String name = sc.nextLine();
                System.out.print("Nhập tuổi nhân viên: "); int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập phòng ban: "); String department = sc.nextLine();
                System.out.print("Nhập code: "); String code = sc.nextLine();
                System.out.print("Nhập lương nhân viên: "); Double salaryRate = sc.nextDouble();

                Employee employee = new Employee(id, name, age, department, code, salaryRate);
                listEmployee.addEmployee(employee);
                System.out.println();

            }else if (select == 2) {
//				2. In danh sách nhân viên ra màn hình
                listEmployee.showListEmployee();
                System.out.println();

            }else if (select == 3) {
//				3. Xóa 1 nhân viên ra khỏi danh sách theo id nhân viên
                System.out.print("Nhập mã nhân viên (id): ");
                String id = sc.nextLine();
                Employee employee = new Employee(id);
                System.out.print("Xóa nhân viên trong danh sách: " + listEmployee.removeEmployee(employee));
                System.out.println();System.out.println();
            }else if (select == 4) {
//				4. Kiểm tra xem nhân viên có tồn tại trong DS ko để xóa
                System.out.print("Nhập mã nhân viên (id): ");
                String id = sc.nextLine();
                Employee employee = new Employee(id);
                System.out.print("Kiểm tra nhân viên có trong danh sách: " + listEmployee.checkEmployee(employee));
                System.out.println();System.out.println();
            }
        } while(select != 0);
    }
}
