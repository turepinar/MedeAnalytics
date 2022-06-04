package com.ua.learning.project.model.menu;

import com.ua.learning.project.model.Page;

public class CDIMenu implements Page {

    @Override
    public void selectMenu() {
        System.out.println("CDI menu was selected");
    }
}
