package com.TestNG.basics;

import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

public class DemoClassTest {

    @BeforeSuite
    public void test_before(){
        System.out.println("Before suite Test");
    }
    @BeforeTest
    public void test_beforeTest(){
        System.out.println("Before Test Test");
    }
    @BeforeClass
    public void test_beforeClass(){
        System.out.println("Before Test Class");
    }
    @BeforeMethod
    public void test_beforeMethod(){
        System.out.println("Before Test Method");
    }

    @Parameters({"UserName","Password"})
    @Test(priority=1)
    public void test_1(String username, String password){
        System.out.println(username + " " + password);
        System.out.println("My First Test NG test");
    }

    //@Test(priority=0)
    //@Test(enabled = false)
    @Test
    public void test_2(){
        System.out.println("My second Test NG test");
        //Assert.fail();
    }
    //@Ignore
    @Test(dependsOnMethods = {"test_2"})
    public void test_3(){
        System.out.println("My Thirst test of TestNG");
    }

    @Test
    public void test_4(){
        System.out.println("My fourth test of TestNG");
        if(0==0){
        throw new SkipException("My skip test");}
        System.out.println("Skip exception continue");
    }

    @Test(priority = 0)
    public void test_5(){
        System.out.println("My fifth test of TestNG");
    }
}
