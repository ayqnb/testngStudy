package com.course.testng.parameter;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvideTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age, String sex) {
        System.out.println("name=" + name + "; age=" + age + "; sex=" + sex);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        Object[][] o = new Object[][]{
                {"zhangsa", 123, "man"},
                {"lisi", 50, "female"},
                {"wangwu", 90, "man"}
        };
        return o;
    }

    @DataProvider(name = "testData")
    public Object[][] testDataProvider(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"test1-zhangsan", 50},
                    {"test1-lisi", 60}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"test2-wangwu", 60},
                    {"test2-zhaoliu", 70}
            };
        }

        return result;
    }

    @Test(dataProvider = "testData")
    public void test1(String name, int age) {
        System.out.println("Method test11111    name=" + name + "; age=" + age);
    }

    @Test(dataProvider = "testData")
    public void test2(String name, int age) {
        System.out.println("Method test22222    name=" + name + "; age=" + age);
    }
}
