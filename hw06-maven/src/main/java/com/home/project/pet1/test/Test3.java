package com.home.project.pet1.test;

import com.home.project.pet1.annotation.After;
import com.home.project.pet1.annotation.Before;
import com.home.project.pet1.annotation.Test;

public class Test3 {

    @Before
    public int before1() {
        return 1;
    }

    @Test
    public boolean test() {
        return false;
    }

    @After
    public String after1() {
        return null;
    }

    @After
    public int after2() {
        return 5;
    }
}
