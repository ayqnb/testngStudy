package com.course.testng;

import org.testng.annotations.Test;

public class ExceptionTest {
    @Test(expectedExceptions=RuntimeException.class)
    public void exceptionTest001(){
        System.out.println("这是一个失败的exception测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionPass(){
        System.out.println("pass exception");
        throw new RuntimeException();
    }
}
