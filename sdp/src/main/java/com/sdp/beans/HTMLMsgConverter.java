package com.sdp.beans;

public class HTMLMsgConverter implements IMessageConverter{
    @Override
    public String msgConverter(String msg) {
        return "<html><body>" + msg + "</body></html>";
    }
}
