package net.abstracttools.demo.demo_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain
{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = (Knight)context.getBean("knight");
        knight.embarkOnQuest();
    }
}
