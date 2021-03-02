package com.home.project.pet1;

import com.home.project.pet1.annotation.Before;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class <?> clazz =  Class.forName("com.home.project.pet1.test.Test1");
        testRunner(clazz);
    }

    public static void testRunner(Class testClass){
        int tests = 0;
        int passed = 0;
        for (Method m : testClass.getDeclaredMethods()) {
            m.getAnnotations();
            try {
                m.invoke(testClass.getConstructor().newInstance());
            } catch (NoSuchMethodException | InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
