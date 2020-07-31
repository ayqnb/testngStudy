package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1:");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是beforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是AfterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass test");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite test");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("AfterSuite test");
    }
}
