import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class HardAssertionTest {

   @Test
    public void test_1(){
        System.out.println("My First Test NG test");
       Assert.assertEquals(4,5,"My Condition is false");
    }


    @Test
    public void test_2(){
        System.out.println("My second Test NG test");
        Assert.assertFalse(5>20);
        //Assert.fail();
    }

    @Test
    public void test_3(){
        System.out.println("My Thirst test of TestNG");
        Assert.assertTrue(5>20);
    }

    @Test
    public void test_4(){
        System.out.println("My fourth test of TestNG");

    }

    @Test
    public void test_5(){
        System.out.println("My fifth test of TestNG");
    }
}
