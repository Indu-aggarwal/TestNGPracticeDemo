import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

    SoftAssert obj = new SoftAssert();

    @Test
    public void test_1(){
        System.out.println("My First Test NG test");
        obj.assertEquals(4,5,"test failed");
        obj.assertEquals(4,9,"test failed");
        obj.assertEquals(4,1,"test failed");

        System.out.println("Test continues");
        obj.assertAll();
    }


    @Test
    public void test_2(){
        System.out.println("My second Test NG test");
    }

    @Test
    public void test_3(){
        System.out.println("My Thirst test of TestNG");
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
