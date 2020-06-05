package com.ann;

/**
 * @author longquan
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男的给的评价是：wait...");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女的给的评价是：wait...");
    }
}
