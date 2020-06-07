package practice;

import practice.package1.Employee;
// 导包要导入全路径

/**
 * @author mjs20
 */
public class EmployeeTest {


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setName("张国强");
        employee1.setAge(23);
        employee1.setDesignation("职员");
        employee1.setSalary(3500);

        employee2.setName("张天王");
        employee2.setAge(45);
        employee2.setDesignation("工程师");
        employee2.setSalary(10000);

        System.out.println(employee1.toString());

        System.out.println(employee2.toString());

    }

}
