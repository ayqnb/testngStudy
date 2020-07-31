package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void befeoreSuite(){
        System.out.println("beforeSuite running");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite running");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("Before Class");
//    }
//    @AfterClass
//    private void afterClass(){
//        System.out.println("After Class");
//    }
}

