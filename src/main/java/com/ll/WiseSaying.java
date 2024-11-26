package com.ll;

public class WiseSaying {
    private int id;
    private String content;
    private String author;

    WiseSaying(int id,String content,String author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId(){
        return id;
    }
    public String getContent(){
        return content;
    }
    public String getAuthor(){
        return author;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void getAll(){
        System.out.println(String.format("%d / %s / %s",this.id,this.author,this.content));
    }
}
