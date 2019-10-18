package camera;


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

//    @Bean
//    public static TestBeanFactoryPostProc testBeanFactoryPostProc() {
//        return new TestBeanFactoryPostProc();
//    }

//    @Bean
//    public static UnproducableCameraRollBeanFactoryPostProcessor unproducableCameraRollBeanFactoryPostProcessor() {
//        return new UnproducableCameraRollBeanFactoryPostProcessor();
//    }

    @Bean
    public static ChangeCameraRollBeanPostProcessor changeCameraRollBeanPostProcessor(){
        return new ChangeCameraRollBeanPostProcessor();
    }
}
