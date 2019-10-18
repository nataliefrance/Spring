package camera;

public interface Camera {
    void doPhotograph();
    void setCameraRoll(CameraRoll cameraRoll);
    CameraRoll getCameraRoll();
    void breaking();
    boolean isBroken();
}
