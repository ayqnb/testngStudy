package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是Server组测试1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是Server组测试22222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是Client组测试3333");
    }
    @BeforeGroups("server")
    public void beforeGroupAnnotation(){
        System.out.println("BeforeGroup----Server组提示");
    }
    @AfterGroups("server")
    public void afterGroupAnnotation(){
        System.out.println("AfterGroup----Server组提示");
    }
    @BeforeGroups("client")
    public void beforeClientAnnotation(){
        System.out.println("BeforeGroup----Client组提示");
    }
    @AfterGroups("client")
    public void afterClientAnnotation(){
        System.out.println("AfterGroup----Client组提示");
    }
}
