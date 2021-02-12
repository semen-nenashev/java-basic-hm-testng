package com.homework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTests {
    @DataProvider(name = "testOne")
    public Object[][] newData() {
        return new Object[][]{
                {"Cedric", new Integer(36)},
                {"Anne", new Integer(37)},
                {"Sem", new Integer(22)}
        };
    }

    @DataProvider(name = "testTwo")
    public Object[][] Data() {
        return new Object[][]{
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36}
        };
    }

    @Test(dataProvider = "testOne")
    public void PrintName(String name, int age) {
        System.out.println(name + ": " + age);
    }

    @Test(dataProvider = "testTwo")
    public void SquareNumb(int number, int result) {
        int res = number * number;
        Assert.assertEquals(res, result, "Test failed!");
    }


    @Parameters({"firstParameter"})
    @Test
    public void FirstXMLParam(String firstParameter) {
        System.out.println("Simple String parameter " + firstParameter);
    }

    @Parameters({"secondParameter"})
    @Test
    public void SecondXMLParam(String secondParameter) {
        System.out.println("Second Parameter: " + secondParameter);
    }


}
