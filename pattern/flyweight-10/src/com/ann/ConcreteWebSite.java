package com.ann;

import com.ann.improve.User;

/**
 * @author longquan
 * <p>
 * 具体的网站
 *
 * 这里不仅需要内部状态 type
 * 也需要一个外部状态 User
 */
public class ConcreteWebSite extends WebSite {

    //  共享的部分，内部状态
    //  网站类型：比如 博客、商城
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为= " + type + ",使用者为： " + user.getName());
    }
}
