package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
//    @Test(parameters = {"name","age"})
    @Parameters({"name","age"})
    @Test
    public void parameterTest(String name,int age){
        System.out.println("name;"+name+"; age="+age);
    }
}
