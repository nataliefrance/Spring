package camera;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

class ChangeCameraRollBeanPostProcessor implements BeanPostProcessor {

    public ChangeCameraRollBeanPostProcessor () {
        System.out.println("ChangeCameraRollBeanPostProcessor constructor called");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("postProcessBeforeInitialization method invoked");
        System.out.println(bean.getClass() + "  " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("postProcessAfterInitialization method invoked");
        System.out.println(bean.getClass() + "  " + beanName);
        if (bean instanceof BlackAndWhiteCameraRoll) {
            bean = new ColorCameraRoll();
        }
        return bean;
    }
}
