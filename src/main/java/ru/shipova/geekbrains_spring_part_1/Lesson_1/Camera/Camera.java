package ru.shipova.geekbrains_spring_part_1.Lesson_1.Camera;

public interface Camera {
    void doPhotograph();
    void setCameraRoll(CameraRoll cameraRoll);
    CameraRoll getCameraRoll();
    void breaking();
    boolean isBroken();
}
