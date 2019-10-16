package ru.shipova.geekbrains_spring_part_1.Lesson_1.Camera;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration//аннотация, указывающая на то, что данный Java-класс является классом конфигурации
public class AppConfig {

    @Bean(name="cameraRoll")// используется для аннотирования методов, создающих бины в классе, помеченном аннотацией @Configuration. Аналог тега <bean…../> в XML-конфигурации
    public CameraRoll cameraRoll() {
        return new BlackAndWhiteCameraRoll();
    }

    @Bean(name="camera")
    @Scope("prototype")
    public Camera camera(CameraRoll cameraRoll){
        Camera camera = new CameraImpl();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }

    @Bean
    public static TestBeanFactoryPostProc testBeanFactoryPostProc() {
        return new TestBeanFactoryPostProc();
    }
}
