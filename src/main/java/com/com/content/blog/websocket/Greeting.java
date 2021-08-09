package com.com.content.blog.websocket;

import lombok.Setter;

/**
 * @author : ycd63
 * @packageName : com.com.content.blog
 * @date : 2021-08-09
 * @Time : 오후 3:53
 * @description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2021-08-09           ycd63                 최초 생성
 */

public class Greeting {

    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
