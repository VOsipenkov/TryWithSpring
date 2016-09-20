package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.Robot;

public class Start {
    public static void main(String[] args){
            ApplicationContext context =new ClassPathXmlApplicationContext("Bean.xml");
            Robot robot = (Robot)context.getBean("T1000");
            robot.dance();
    }
}   
