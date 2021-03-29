package com.home.project.pet1.test;

import com.home.project.pet1.annotation.After;
import com.home.project.pet1.annotation.Before;
import com.home.project.pet1.annotation.Test;

public class Test1 {

    private static int i = 0;
    public String str;

    @Before
    public int before1() {
        System.out.println("Предварительное значение i установлено равное " + (i=1));
        return i;
    }

    @Test
    public boolean test() {
        System.out.println( "Равно ли значение i нулю? " + (i==0));
        return (i==0);
    }

    @After
    public String  after1() throws IllegalAccessException {
        System.out.println("Отработал After");
        throw new IllegalAccessException();

    }
}
