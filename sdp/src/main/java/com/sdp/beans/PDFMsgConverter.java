package com.sdp.beans;

public class PDFMsgConverter implements IMessageConverter{
    @Override
    public String msgConverter(String msg) {
        return "<pdf>" + msg + "</pdf>";
    }
}
