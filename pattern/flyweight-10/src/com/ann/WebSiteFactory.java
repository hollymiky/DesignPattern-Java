package com.ann;

import java.util.HashMap;

/**
 * @author longquan
 *
 * 网站工厂类，根据需求，返回一个具体网站
 */
public class WebSiteFactory {

    //  网站集合，充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //  根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中
    public WebSite getWebSiteCategory(String type){
        //  如果没有，就创建一个放入池中
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    //  获取网站分类的总数(池中有多少个实际的网站类型)
    public int getWebSiteCount(){
        return pool.size();
    }

}
