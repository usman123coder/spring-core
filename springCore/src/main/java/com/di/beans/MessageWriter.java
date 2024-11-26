package com.di.beans;

public class MessageWriter {

    private IMessageConverter messageConverter;

    public void writeMessage(String msg){
        String cMessage = null;

        cMessage = messageConverter.messageConverter(msg);

        System.out.println("this is my msg " + cMessage);
    }

    public void setMessageConverter(IMessageConverter messageConverter){
        this.messageConverter = messageConverter;
    }


}
