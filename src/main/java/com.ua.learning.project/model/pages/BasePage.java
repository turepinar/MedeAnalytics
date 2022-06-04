package com.ua.learning.project.model.pages;

public abstract class BasePage {

    private String URL;

    public BasePage(){}

    public BasePage(String url){
        this.URL=url;
    }

    public void openWindow(String url){
        System.out.println(url);
    }





}
