package ru.shipova.geekbrains_spring_part_1.Lesson_1.Camera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("configCamera.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Получает фотоаппарат
        Camera camera = context.getBean("camera", Camera.class);
        // Ломает фотоаппарат
        camera.breaking();
        // Пытается сделать фото. Неудача!
        camera.doPhotograph();

        // Просит еще один фотоаппарат
        camera = context.getBean("camera", Camera.class);
        // Пытается сделать фото
        camera.doPhotograph();
    }
}
