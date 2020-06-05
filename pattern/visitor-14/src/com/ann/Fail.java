package com.ann;

/**
 * @author longquan
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男的给的评价是：fail....");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女的给的评价是：fail....");
    }
}
