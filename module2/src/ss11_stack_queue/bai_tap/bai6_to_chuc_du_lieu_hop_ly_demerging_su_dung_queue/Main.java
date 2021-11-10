package ss11_stack_queue.bai_tap.bai6_to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> female = new LinkedList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bao", 21, 12, "male"));
        employees.add(new Employee("Tuan", 21, 12, "female"));
        employees.add(new Employee("Lan", 21, 12, "female"));
        employees.add(new Employee("Thien", 21, 12, "male"));
        employees.add(new Employee("Trang", 21, 12, "female"));
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.gender.equals("male")) {
                male.add(employee);
            } else if (employee.gender.equals("female")) {
                female.add(employee);
            }
        }
        while (!female.isEmpty()) {
            result.add(female.poll());
        }
        while (!male.isEmpty()) {
            result.add(male.poll());
        }
        System.out.println("Dữ liệu sau khi sắp xếp");
        for (Employee employee : result) {
            System.out.println(employee.toString());
        }

	}

}
