package com.ujiuye;

public class MailTemp {

    private String from;      //发送者
    private String to;          //收件人
    private String title;       //题目
    private String content; //内容

    public MailTemp() {
    }

    public MailTemp(String from, String to, String title, String content) {
        this.from = from;
        this.to = to;
        this.title = title;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
