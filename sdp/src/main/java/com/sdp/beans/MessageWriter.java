package com.sdp.beans;

public class MessageWriter {
    private IMessageConverter messageConverter;

    public void messageWriter(String msg){
        String text = messageConverter.msgConverter("Hii I am a Usman");
        System.out.println(text);
    }

    public void setMessageConverter(IMessageConverter messageConverter){
        this.messageConverter = messageConverter;
    }

}
