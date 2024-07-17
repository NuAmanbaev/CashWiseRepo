package testNGTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public  void  googleTest1() throws InterruptedException {
        System.out.println("this is google test 1");
        Assert.assertTrue( 5 > 2 );
        Thread.sleep(10000);

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before Method");

    }
    @Test
    public  void  googleTest2() throws InterruptedException {
        System.out.println("this is google test 1");
        Assert.assertTrue( 5 > 2 );
        Thread.sleep(15000);

    }


}
