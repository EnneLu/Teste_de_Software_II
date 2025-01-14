/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 18:01:44 GMT 2024
 */

package org.example.org.example;

import org.example.*;
import org.example.ConversorTemperatura_ESTest_scaffolding2;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConversorTemperatura_ESTest22 extends ConversorTemperatura_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConversorTemperatura conversorTemperatura0 = new ConversorTemperatura();
      Celsius celsius0 = new Celsius();
      celsius0.setValue(100.0);
      Temperatura temperatura0 = conversorTemperatura0.converte(celsius0);
      assertEquals(148.0, temperatura0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConversorTemperatura conversorTemperatura0 = new ConversorTemperatura();
      Fahrenheit fahrenheit0 = new Fahrenheit();
      Temperatura temperatura0 = conversorTemperatura0.converte(fahrenheit0);
      temperatura0.setValue((-238.0326));
      try { 
        conversorTemperatura0.converte(temperatura0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N\u00E3o h\u00E1 temperatura abaixo do zero absoluto
         //
         verifyException("org.example.Fahrenheit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConversorTemperatura conversorTemperatura0 = new ConversorTemperatura();
      // Undeclared exception!
      try { 
        conversorTemperatura0.converte((Temperatura) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.ConversorTemperatura", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConversorTemperatura conversorTemperatura0 = new ConversorTemperatura();
      Celsius celsius0 = new Celsius();
      Temperatura temperatura0 = conversorTemperatura0.converte(celsius0);
      Temperatura temperatura1 = conversorTemperatura0.converte(temperatura0);
      assertEquals((-32.0), temperatura0.getValue(), 0.01);
      assertEquals((-160.0), temperatura1.getValue(), 0.01);
  }
}
