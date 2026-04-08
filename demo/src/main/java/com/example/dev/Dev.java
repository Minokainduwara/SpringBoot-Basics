package com.example.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    private laptop lp;
    public void build(){
        lp.compile();
        System.out.println("Dev build");
    }
}
