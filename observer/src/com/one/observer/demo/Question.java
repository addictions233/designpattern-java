package com.one.observer.demo;

/**
 * @ClassName: Question
 * @Description: 问题类
 * @Author: one
 * @Date: 2022/05/08
 */
public class Question {
    /**
     * 提问者
     */
    private String username;

    /**
     * 问题内容
     */
    private String content;

    public Question(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
