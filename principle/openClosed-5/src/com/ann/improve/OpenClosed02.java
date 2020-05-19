package com.ann.improve;


/**
 * @author longquan
 * @date 2020/5/19 4:20 下午
 *
 *
 * 开闭原则---优化OpenClosed01
 *
 * 改进优化思路：
 * 把创建Shape类作为抽象类，并提供一个抽象的draw方法，让子类去实现即可，
 * 这样我们有新的图形种类时，只需要让新的图形类继承Shape，并实现draw方法即可，使用方的代码就不需要修改。以满足开闭原则
 */
public class OpenClosed02 {

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
    }
}

/**
 * 用于绘图的类
 */
class GraphicEditor{
    //  使用方，不需要做任何改变，只需要去扩展就行
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    //  定义一个抽象方法
    public abstract void draw();
}


/**
 * 矩形类
 */
class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形...");
    }
}

/**
 * 圆形类
 */
class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形...");
    }
}

/**
 * 此时新增一个图形，只需要实现shape中的抽象方法即可
 */
class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("绘制三角形...");
    }
}
