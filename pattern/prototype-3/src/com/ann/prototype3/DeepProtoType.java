package com.ann.prototype3;

import java.io.*;

/**
 * @author longquan
 * @date 2020/5/22 5:51 下午
 *
 * 深拷贝---两种方式：
 * 1. 重写clone方法
 * 2. 使用对象的序列化实现 [推荐]
 */
public class DeepProtoType implements Serializable,Cloneable {

    private static final long serialVersionUID = -3151351052022403608L;

    public String name;
    //  引用类型的属性
    public DeepCloneableTarget target;

    public DeepProtoType() {
    }

    /**
     * 实现深拷贝，方式1，使用重写clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //  这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        //  单独对引用类型的属性进行处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.target = (DeepCloneableTarget) target.clone();

        return deepProtoType;
    }

    /**
     * 方式二，使用对象的序列化实现【推荐使用】
     */
    public Object deepClone(){
        //  输出流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        //  输入流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            //  序列化操作
            bos = new ByteArrayOutputStream();
            //  将字节输出流转换成对象输出流
            oos = new ObjectOutputStream(bos);

            //  将当前对象以对象流的方式输出
            oos.writeObject(this);

            //  反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            DeepProtoType copyObject = (DeepProtoType) ois.readObject();

            return copyObject;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                //  assert 断言这些流不为空，true的话则继续执行，否则终止执行
                assert bos != null;
                bos.close();
                assert oos != null;
                oos.close();
                assert bis != null;
                bis.close();
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
