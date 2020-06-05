package com.ann;

import java.util.LinkedList;
import java.util.List;

/**
 * @author longquan
 *
 * 数据结构，管理Man、Woman
 * 维护一个集合
 */
public class ObjectStructure {

    private List<Person> persons = new LinkedList<>();

    //  添加
    public void attach(Person person){
        persons.add(person);
    }

    //  移除
    public void detach(Person person){
        persons.remove(person);
    }

    //  显示评测情况
    public void display(Action action){
        for (Person person:persons) {
            person.accept(action);
        }
    }

}
