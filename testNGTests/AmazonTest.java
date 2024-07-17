package testNGTests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AmazonTest {

    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("this is before suit ");
    }



    @Test
    public void amazonTest1(){
        System.out.println("Amazon test 1 ");

    }
    @Test
    public void amazonTest2(){
        System.out.println("Amazon test 2 ");

    }
    @Test
    public void amazonTest3(){
        System.out.println("Amazon test 3 ");

    }



}
