package com.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Setting Up everything");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Clearing everything");
    }

    @Before
    public void setUp() {
        System.out.println("Setting Up");
    }

    @Test
    public void test1() {
        System.out.println("Testing 1");
    }

    @Test
    public void test2() {
        System.out.println("Testing 2");
    }

    @After
    public void tearDown() {
        System.out.println("Clearing");
    }
}
