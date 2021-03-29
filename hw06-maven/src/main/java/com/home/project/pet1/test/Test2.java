package com.home.project.pet1.test;

import com.home.project.pet1.annotation.After;
import com.home.project.pet1.annotation.Before;
import com.home.project.pet1.annotation.Test;

public class Test2 {
    public static int х = 0;

    @Before
    public int before1() {
        System.out.println("Предварителььное значение х установлено " +(х=2));
        return х;
    }

    @Before
    public int before2() {
        System.out.println("Предвариетльное значение х изменено на " +(х=3));
        return х;
    }

    @Test
    public boolean test() {
        System.out.println("Равен ли х по-прежнему 2? " + (х==2));
        return (х==2);

    }

    @After
    public void  after1() {
        System.out.println("Отработал After");

    }
}

