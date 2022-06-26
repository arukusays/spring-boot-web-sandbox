package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Messages {
    
    private String msg;

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    @Override
    public String toString(){
        return "Messages:msg=["+msg+"]";
    }
}
