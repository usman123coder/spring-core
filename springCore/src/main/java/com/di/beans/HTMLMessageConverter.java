package com.di.beans;

public class HTMLMessageConverter implements IMessageConverter {

    public String messageConverter(String msg){
        return "<html>" + msg + "</html>";
    }
}
