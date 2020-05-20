package com.ann.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longquan
 * @date 2020/5/19 5:58 下午
 *
 *
 * 迪米特法则---优化 .Demeter01
 *
 * 针对Demeter01的改进：
 * 1. 问题在于SchoolManager中，CollegeEmployee类并不是SchoolManager的直接朋友
 * 2. 按照迪米特法则，应该避免类中出现这样非直接朋友关系的耦合
 */
public class Demeter02 {

    public static void main(String[] args) {
        System.out.println("使用迪米特法则改进");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

/**
 * 学校总部员工
 */
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学院员工
 */
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager{

    public void printCollegeEmpInfo(){
        List<CollegeEmployee> list = getAllEmployee();
        System.out.println("--------学院员工--------");
        for (CollegeEmployee e : list) {
            System.out.println(e.getId());
        }
    }

    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        //  新增10个员工到学院
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= "+i);
            list.add(emp);
        }
        return list;
    }
}

/**
 * 学校管理类
 *
 * 分析存在的直接朋友：(出现成员变量、方法参数、方法返回值中的类为直接的朋友)
 * Employee、CollegeManager
 * CollegeEmployee 不是直接朋友，违背了迪米特法则
 */
class SchoolManager{

    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        //  新增5个员工到学校
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= "+i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 打印学院和学校总部所有员工的id
     */
    void printAllEmployee(CollegeManager sub){
        //  将这段代码封装到CollegeManager中
        /*List<CollegeEmployee> list = sub.getAllEmployee();
        System.out.println("--------学院员工--------");
        for (CollegeEmployee e : list) {
            System.out.println(e.getId());
        }*/
        sub.printCollegeEmpInfo();

        List<Employee> list2 = getAllEmployee();
        System.out.println("--------学校总部员工--------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}

