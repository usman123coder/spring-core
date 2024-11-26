package com.di.test;

import com.di.beans.WeatherWidget;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("com/di/common/application-context.xml");
        WeatherWidget weatherWidget = (WeatherWidget) context.getBean("weatherWidget");
        weatherWidget.showWeather("462003");
    }
}
