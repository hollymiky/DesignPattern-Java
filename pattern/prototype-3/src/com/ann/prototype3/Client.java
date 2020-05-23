package com.ann.prototype3;

/**
 * @author longquan
 * @date 2020/5/23 10:29 上午
 *
 * 测试深克隆
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "AAA";
        deepProtoType.target = new DeepCloneableTarget("targetName1","TargetClass1");

        //  方式1完成深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();

        //  比较两个target的hashCode值来判断是否还是同一个对象？
        // System.out.println("DeepProtoType.name= "+deepProtoType.name + "DeepProtoType.target= "+deepProtoType.target.hashCode());
        // System.out.println("DeepProtoType1.name= "+deepProtoType1.name + "DeepProtoType1.target= "+deepProtoType1.target.hashCode());


        // 方式2完成深拷贝
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println("DeepProtoType.name= "+deepProtoType.name + "DeepProtoType.target= "+deepProtoType.target.hashCode());
        System.out.println("DeepProtoType2.name= "+deepProtoType2.name + "DeepProtoType2.target= "+deepProtoType2.target.hashCode());
    }
}
