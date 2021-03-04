package com.home.project.pet1;

import com.home.project.pet1.annotation.After;
import com.home.project.pet1.annotation.Before;
import com.home.project.pet1.annotation.Test;
import com.home.project.pet1.test.Test1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class <?> clazz =  Class.forName("com.home.project.pet1.test.Test1");
        testRunnerBefore(clazz);
        testRunnerTest(clazz);
        testRunnerAfter(clazz);
       // Class <?> clazz2 =  Class.forName("com.home.project.pet1.test.Test2");
        //testRunnerBefore(clazz2);
      //  testRunnerTest(clazz2);
       // Class <?> clazz3 =  Class.forName("com.home.project.pet1.test.Test3");
       // testRunnerBefore(clazz3);
       // testRunnerTest(clazz3);
    }

    public static void testRunnerBefore(Class testClass){
        int tests = 0;
        int passed = 0;
        for (Method m : testClass.getDeclaredMethods()) {
            m.getAnnotations();
            if (m.isAnnotationPresent(Before.class)) {
                tests++;
                try {
                    m.invoke(testClass.getConstructor().newInstance());
                    passed++;
                } catch (NoSuchMethodException | InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);

    }
    public static void testRunnerTest(Class testClass){
        int tests = 0;
        int passed = 0;
        for (Method m : testClass.getDeclaredMethods()) {
            m.getAnnotations();
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(testClass.getConstructor().newInstance());
                    passed++;
                } catch (NoSuchMethodException | InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);

    }

    public static void testRunnerAfter(Class testClass){
        int tests = 0;
        int passed = 0;
        for (Method m : testClass.getDeclaredMethods()) {
            m.getAnnotations();
            if (m.isAnnotationPresent(After.class)) {
                tests++;
                try {
                    m.invoke(testClass.getConstructor().newInstance());
                    passed++;
                } catch (NoSuchMethodException | InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);

    }
}
