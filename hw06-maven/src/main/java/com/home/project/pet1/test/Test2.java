package com.home.project.pet1.test;

import com.home.project.pet1.annotation.After;
import com.home.project.pet1.annotation.Before;
import com.home.project.pet1.annotation.Test;

public class Test2 {

    @Before
    public int before1() {
        return 2;
    }

    @Before
    public int before2() {
        return 3;
    }

    @Test
    public boolean test() {
        return true;
    }

    @After
    public String after1() {
        return null;
    }
}

