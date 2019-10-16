package ru.shipova.geekbrains_spring_part_1.Lesson_1.Camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("configCamera.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
    }

}
