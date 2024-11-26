package com.sdp.test;

import com.sdp.beans.MessageWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SDPTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("com/sdp/common/app-context.xml");
        MessageWriter messageWriter = (MessageWriter) context.getBean("messageWriter");
        messageWriter.messageWriter("123");
    }
}
