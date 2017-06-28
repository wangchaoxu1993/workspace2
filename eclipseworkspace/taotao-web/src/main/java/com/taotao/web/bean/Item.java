package com.taotao.web.bean;

import org.apache.commons.lang3.StringUtils;

public class Item extends com.taotao.manage.pojo.Item {

    public String[] getImages(){
        // StringUtils中提供的split性能比jdk中的更高，而jdk中的功能强大
        // 如果单纯是拼接字符串这种简单的，推荐使用StringUtils类
        return StringUtils.split(super.getImage(), ',');
    }
    
}