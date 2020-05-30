package com.ann.improve;

/**
 * @author longquan
 *
 * 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        // do noting
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
