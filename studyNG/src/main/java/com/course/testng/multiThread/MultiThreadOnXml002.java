package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml002 {
    @Test
    public void test1() {
        System.out.printf("002 Thread id is %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf("002 Thread id is %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf("002 Thread id is %s%n", Thread.currentThread().getId());
    }
}
