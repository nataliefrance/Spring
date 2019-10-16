package ru.shipova.geekbrains_spring_part_1.Lesson_1.HelloMan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloManOnceSay helloManOnceSay = context.getBean("helloMan", HelloManOnceSay.class);
        helloManOnceSay.helloSay();
    }
}