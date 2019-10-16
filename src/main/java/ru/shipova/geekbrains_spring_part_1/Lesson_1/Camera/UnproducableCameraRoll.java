package ru.shipova.geekbrains_spring_part_1.Lesson_1.Camera;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Применение данной аннотации означает, что фотопленка этого класса больше не производится. Значение поля usingCameraRollClass должно указывать на класс пленки, которую следует использовать вместо данной.
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface UnproducableCameraRoll {
    Class usingCameraRollClass();
}
