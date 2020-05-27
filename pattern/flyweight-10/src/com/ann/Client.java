package com.ann;

import com.ann.improve.User;

/**
 * @author longquan
 *
 *
 * 这样的形式虽然体现出了享元模式，但又不是很完整的享元
 *
 * 因为缺少 外部状态（即这些网站应该分别被不同用户使用）
 * 此时，新增一个User
 */
public class Client {

    public static void main(String[] args) {
        //  创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();


        //  需求1：客户想要一个以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("张三"));

        System.out.println("----------------------------");

        //  需求2：需要一个博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("李四"));

        System.out.println("----------------------------");

        //  需求3：需要一个博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("王五"));

        System.out.println("----------------------------");

        //  需求4：需要一个博客形式发布的网站
        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.use(new User("赵六"));

        System.out.println("----------------------------");

        System.out.println("目前网站池中共有这些类型个数=" + webSiteFactory.getWebSiteCount());
    }

}
