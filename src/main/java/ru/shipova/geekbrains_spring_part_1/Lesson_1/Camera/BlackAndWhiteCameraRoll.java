package ru.shipova.geekbrains_spring_part_1.Lesson_1.Camera;

import org.springframework.stereotype.Component;

@Component("cameraRoll")
@UnproducableCameraRoll(usingCameraRollClass = ColorCameraRoll.class)
public class BlackAndWhiteCameraRoll implements CameraRoll {
    public void processing() {
        System.out.println("-1 черно-белый кадр");
    }
}
