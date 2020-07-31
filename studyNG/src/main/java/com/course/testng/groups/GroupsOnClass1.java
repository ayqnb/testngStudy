package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {
    public void stu1OnClass1(){
        System.out.println("Class1111-stu111111");
    }
    public void stu2OnClass1(){
        System.out.println("Class1111-stu2222222");
    }
}
