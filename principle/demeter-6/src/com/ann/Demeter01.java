package com.ann;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longquan
 * @date 2020/5/19 5:31 下午
 * <p>
 * 迪米特法则---发现问题
 * <p>
 * 案例：
 * 有一个学校，下属有各个学院和总部，现要求打印出学校总部员工ID和学院员工的ID
 *
 * 分析存在的直接朋友：(出现成员变量、方法参数、方法返回值中的类为直接的朋友)
 * Employee、CollegeManager
 * CollegeEmployee 不是直接朋友，违背了迪米特法则
 *
 * 分析：
 * 1. 因为这里的CollegeEmployee不是SchoolManager的直接朋友
 * 2. CollegeEmployee是以局部变量方式出现在SchoolManager
 *
 * 优化方案参考 com.ann.improve.Demeter02
 */
public class Demeter01 {

    public static void main(String[] args) {
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
        List<CollegeEmployee> list = sub.getAllEmployee();
        System.out.println("--------学院员工--------");
        for (CollegeEmployee e : list) {
            System.out.println(e.getId());
        }

        List<Employee> list2 = getAllEmployee();
        System.out.println("--------学校总部员工--------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}


