package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;
 
public class CalcTest {

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }

     @Test	
      public void testCal() {
        Calcmul testcalmul = new Calmul();
Calculator testcaladd = new Calculator();
 assertEquals(testcalmul.mul(),18);
 assertEquals(testcaladd.add(),9);
      }

    }
