package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.driver.Main;
public class TestCases {
     @Test
     public void testProductTwoArgs(){
          Main.Product p=new Main.Product();
          assertEquals(6,p.product(2,3));
          assertEquals(0,p.product(0,5));
          assertEquals(-10,p.product(-2,5));
     }
     @Test
     public void testProductThreeArgs(){
          Main.Product p=new Main.Product();
          assertEquals(30,p.product(2,3,5));
          assertEquals(0,p.product(0,5,10));
          assertEquals(-20,p.product(-2,2,5));
     }
     @Test
     public void testProductDoubleArgs(){
          Main.Product p=new Main.Product();
          assertEquals(8.75,p.product(2.5,3.5),0.0001);
          assertEquals(0.0,p.product(0.0,5.0),0.0001);
          assertEquals(-10.5,p.product(-2.0,5.25),0.0001);
     }
}
