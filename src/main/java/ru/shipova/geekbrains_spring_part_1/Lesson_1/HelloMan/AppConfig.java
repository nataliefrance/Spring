package ru.shipova.geekbrains_spring_part_1.Lesson_1.HelloMan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="helloMan")
    public HelloMan helloMan(@Value("Yuri") String name) {
        HelloMan helloMan = new HelloManOnceSay(name);
        return helloMan;
    }
}
