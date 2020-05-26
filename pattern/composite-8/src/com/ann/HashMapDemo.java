package com.ann;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longquan
 *
 * 说明：
 * 1. Map就是一个抽象的构建（即上述例子中的OrganizationComponent）
 * 2. HashMap是一个中间的构建（Composite），实现了相关的方法：put()、putAll()
 * 3. Node是HashMap中的静态内部类，即叶子节点，这里就没有put()、putAll()、remove()
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        //   直接存放叶子节点 Node
        hashMap.put(0,"a");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"b");
        map.put(2,"c");
        map.put(3,"d");
        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}
