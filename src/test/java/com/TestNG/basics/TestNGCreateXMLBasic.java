package com.TestNG.basics;

import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGCreateXMLBasic {

    @Parameters({"UserName","Password"})
    @Test(priority=1)
    public void test_1(String username, String password){
        System.out.println(username + " " + password);
        System.out.println("My First Test NG test");
    }

    //@Test(priority=0)
    //@Test(enabled = false)
    //@Parameters({"UserName","Password"})
    @Test
    public void test_2(){
        //System.out.println(username + " " + password);
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
