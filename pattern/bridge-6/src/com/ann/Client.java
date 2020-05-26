package com.ann;

/**
 * @author longquan
 */
public class Client {


    public static void main(String[] args) {

        //  获取折叠式手机（样式+品牌）

        Phone phone = new FoldedPhone(new HuaWei());

        phone.open();
        phone.call();
        phone.close();

        System.out.println("------------------------");

        Phone phone1 = new FoldedPhone(new XiaoMi());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("------------------------");

        Phone phone2 = new OtherPhone(new HuaWei());
        phone2.open();
        phone2.call();
        phone2.close();

    }

}
