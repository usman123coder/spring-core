package com.di.beans;

public class PDFMsgConverter implements IMessageConverter{
    public String messageConverter(String msg){
        return "<pdf>" + msg + "</pdf";
    }
}
