package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/19 11:01 上午
 *
 * 依赖倒转原则---优化方式：接口传递、构造函数、set方法
 */
public class DependenceInversion03 {

    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new XiaoMiTV());

        System.out.println("----------------------");

        OpenAndClose2 openAndClose2 = new OpenAndClose2(new ChangHongTV());
        openAndClose2.open();

        System.out.println("----------------------");

        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv3(new HUAWEITV());
        openAndClose3.open();
    }
}

/**
 * 方式1：
 * 接口依赖传递
 */
interface IOpenAndClose{
    //  抽象方法，接收一个接口
    void open(ITV tv);
}

interface ITV{
    void play();
}

class XiaoMiTV implements ITV{

    @Override
    public void play() {
        System.out.println("小米TV..");
    }
}

/**
 * 方式1实现
 */
class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}


// ------------------------------------------------

/**
 * 方式2
 * 通过构造方法依赖传递
 */
interface IOpenAndClose2{
    void open();
}

interface ITV2{
    void play();
}

class ChangHongTV implements ITV2{

    @Override
    public void play() {
        System.out.println("长虹TV..");
    }
}

class OpenAndClose2 implements IOpenAndClose2{

    public ITV2 tv2;
    public OpenAndClose2(ITV2 tv2){
        this.tv2 = tv2;
    }

    @Override
    public void open() {
        this.tv2.play();
    }
}


// ------------------------------------------------

/**
 * 方式3
 * 通过set方法依赖传递
 */
interface IOpenAndClose3{
    void open();
}

interface ITV3{
    void play();
}

class HUAWEITV implements ITV3{

    @Override
    public void play() {
        System.out.println("华为TV..");
    }
}

class OpenAndClose3 implements IOpenAndClose3{

    public ITV3 tv3;

    public void setTv3(ITV3 tv3) {
        this.tv3 = tv3;
    }

    @Override
    public void open() {
        this.tv3.play();
    }
}





