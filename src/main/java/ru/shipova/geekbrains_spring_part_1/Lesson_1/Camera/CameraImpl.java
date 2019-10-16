package ru.shipova.geekbrains_spring_part_1.Lesson_1.Camera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("camera")
@Scope("prototype")//Она говорит Spring, что при каждом getBean (camera, Camera.class) необходимо возвращать новый объект фотоаппарата
public class CameraImpl implements Camera {
    @Autowired
    @Qualifier("cameraRoll")//Чтобы избежать исключения, когда в контексте имеется несколько бинов данного типа
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public boolean isBroken() {
        return broken;
    }

    public void breaking(){
        this.broken=true;
    }

    @Autowired
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        if (isBroken()) {
            System.out.println("Фотоаппарат сломан!");
            return;
        }
        System.out.println("Сделана фотография!");
        cameraRoll.processing();
    }
}
