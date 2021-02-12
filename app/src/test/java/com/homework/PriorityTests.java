package com.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTests {
    @Test(priority = 3)
    public void FirstTest() {
        Assert.assertEquals(1, 1, "Test 1 failed!");
        System.out.println("Test 1");
    }

    @Test(priority = 2)
    public void SecondTest() {
        Assert.assertEquals(2, 2, "Test 2 failed!");
        System.out.println("Test 2");
    }

    @Test(priority = 1)
    public void ThirdTest() {
        Assert.assertEquals(3, 3, "Test 3 failed!");
        System.out.println("Test 3");
    }
}
