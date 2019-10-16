package ru.shipova.geekbrains_spring_part_1.Lesson_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//аннотация, указывающая на то, что данный Java-класс является классом конфигурации
public class AppConfig {
    @Bean(name="cameraRoll")// используется для аннотирования методов, создающих бины в классе, помеченном аннотацией @Configuration. Аналог тега <bean…../> в XML-конфигурации
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll() ;
    }

    @Bean(name="camera")
    public Camera camera(CameraRoll cameraRoll){
        Camera camera = new CameraImpl();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }

}
