package com.homework;

import org.testng.Assert;
import org.testng.annotations.*;

public class SeveralTestGroup {

    @BeforeGroups
    public void setUp(){
        System.out.println("Group tests started!");
    }
    @AfterGroups
    public void tearDown(){
        System.out.println("Group tests end!");
    }
    @Test(groups = {"First group"})
    public void FirstTest() {
        Assert.assertEquals(1, 1, "Test 1 failed!");
        System.out.println("Test 1 group 1!");
    }

    @Test(groups = {"Second group"})
    public void SecondTest() {
        Assert.assertEquals(2, 2, "Test 2 failed!");
        System.out.println("Test 2 group 2!");
    }

    @Test(groups = {"First group"})
    public void ThirdTest() {
        Assert.assertEquals(3, 3, "Test 3 failed!");
        System.out.println("Test 3 group 1!");
    }

    @Test(groups = {"Second group"})
    public void FourthTest(){
        Assert.assertEquals(3,3,"Test 4 failed!");
        System.out.println("Test 4 group 2!");
    }

    @Test(groups = {"Third group"},dependsOnGroups = {"First group"})
    public void FifthTest(){
        Assert.assertEquals(3,3,"Test 5 failed!");
        System.out.println("Test 5 group 3!");
    }

    @Test(groups = {"Third group"},dependsOnGroups = {"First group"})
    public void SixthTest(){
        Assert.assertEquals(3,3,"Test 6 failed!");
        System.out.println("Test 6 group 3!");
    }
}
