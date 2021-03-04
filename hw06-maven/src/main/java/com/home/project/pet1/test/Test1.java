package com.home.project.pet1.test;

import com.home.project.pet1.annotation.After;
import com.home.project.pet1.annotation.Before;
import com.home.project.pet1.annotation.Test;

public class Test1 {

    private static int i = 0;
    public String str;

    @Before
    public int before1() {
        i = 1;
        System.out.println(i);
        return i;
    }

    @Test
    public boolean test() {
        boolean b;
        if ( i == 0) b = true;
        else b = false;
            System.out.println(b);
        return b;
    }

    @After
    public String  after1() throws IllegalAccessException {
        str = "OK";
        System.out.println(str);
        throw new IllegalAccessException();
    }
}
