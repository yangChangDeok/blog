package com.com.content.blog.websocket;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : ycd63
 * @packageName : com.com.content.blog
 * @date : 2021-08-09
 * @Time : 오후 3:29
 * @description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2021-08-09           ycd63                 최초 생성
 */
@Getter
@Setter
public class WebMessage {

    private String name;

    public WebMessage(){};

    public WebMessage(String name){
        this.name = name;
    }
}
