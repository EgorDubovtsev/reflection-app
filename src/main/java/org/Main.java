package org;

import org.annotation.Secured;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> entity = Class.forName("org.entity.Entity");
        Method[] declaredMethods = entity.getDeclaredMethods();
        Main main = new Main();

        Arrays.stream(declaredMethods).forEach(main::printMethodData);

    }

    private void printMethodData(Method method) {
        System.out.println(method.getName());
        if (method.isAnnotationPresent(Secured.class)) {

            Secured annotation = method.getAnnotation(Secured.class);
            System.out.println(annotation.toString() + "\n");
        }

    }
}
