package com.valiant_vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created on 12/31/16.
 */
@SpringUI
@Theme("valo")
public class MyUI extends UI {

    private final VaadinWithSpringFromWebinarApplication.MyService service;

    public MyUI(VaadinWithSpringFromWebinarApplication.MyService service){
        this.service = service;
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello world!"));
    }
}
