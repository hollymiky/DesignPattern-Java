package com.ann;

/**
 * @author longquan
 * @date 2020/5/19 4:03 下午
 *
 * 以画图的功能作为例子
 *
 * 开闭原则---发现问题
 *
 * 方式1的优缺点：
 * 1. 优点就是比较理解，简单易操作。
 * 2. 缺点是违反了设计模式的OCP原则，即对扩展开放(提供方)，对修改关闭(使用方)。
 *    即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改。
 * 3. 比如我们这时要新增一个图形种类，我们需要做如下修改，修改的地方比较多。
 *
 *
 * 具体改进参考 com.ann.improve.OpenClosed02
 */
public class OpenClosed01 {

    public static void main(String[] args) {
        //  观察存在的问题
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
    }
}

/**
 * 用于绘图的类
 */
class GraphicEditor{

    //  根据type画不同形状的图案
    public void drawShape(Shape s){
        if(s.type == 1){
            drawRectangle(s);
        }else if(s.type == 2){
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape s){
        System.out.println("绘制..矩形...");
    }

    public void drawCircle(Shape s){
        System.out.println("绘制..圆形...");
    }
}

/**
 * 形状
 */
class Shape{
    int type;
}

/**
 * 矩形类
 */
class Rectangle extends Shape{
    Rectangle(){
        super.type = 1;
    }
}

/**
 * 圆形类
 */
class Circle extends Shape{
    Circle(){
        super.type = 2;
    }
}
