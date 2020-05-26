package com.ann;

/**
 * @author longquan
 */
public class Client {

    public static void main(String[] args) {
        //  从大到小，创建对象

        //  1.创建学校
        OrganizationComponent university = new University("清华大学","中国顶级大学");

        //  2.创建学院
        OrganizationComponent softEngineerCollege = new College("软件工程学院","软件工程");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院","信息工程");

        //  3.创建各个学院下属的系（专业）
        softEngineerCollege.add(new Department("软件工程","软件工程des"));
        softEngineerCollege.add(new Department("网络工程","网络工程des"));
        softEngineerCollege.add(new Department("计算机科学与技术","计算机科学与技术des"));

        infoEngineerCollege.add(new Department("通信工程","通信工程des"));
        infoEngineerCollege.add(new Department("信息工程","信息工程des"));

        //  加这两个学院加到学校中
        university.add(softEngineerCollege);
        university.add(infoEngineerCollege);

        university.print();
    }


}
