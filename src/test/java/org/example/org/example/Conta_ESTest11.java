/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 17:53:35 GMT 2024
 */

package org.example.org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.Conta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Conta_ESTest11 extends Conta_ESTest_scaffolding1 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Conta conta0 = new Conta("r`;iKw'[O", 3755.8070919226);
      try { 
        conta0.transferir(conta0, (-1.0));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Conta conta0 = new Conta("GRH-&&Mvi", (-3100.4489));
      try { 
        conta0.debitar((-3100.4489));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Conta conta0 = new Conta("org.example.Conta", 0.0);
      double double0 = conta0.getSaldo();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Conta conta0 = new Conta("", (-445.016798598987));
      double double0 = conta0.getSaldo();
      assertEquals((-445.016798598987), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Conta conta0 = new Conta(" niuN%zz@7Dr?", 2424.7843748077);
      double double0 = conta0.debitar(1015.262974139158);
      assertEquals(1409.521400668542, conta0.getSaldo(), 0.01);
      assertEquals(1409.521400668542, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Conta conta0 = new Conta((String) null, 457.022);
      conta0.debitar(457.022);
      conta0.debitar(457.022);
      double double0 = conta0.creditar(457.022);
      assertEquals(0.0, conta0.getSaldo(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Conta conta0 = new Conta(":v.v-M12a]TW%y", 1.0);
      conta0.debitar(3715.0);
      double double0 = conta0.creditar(1.0);
      assertEquals((-3713.0), conta0.getSaldo(), 0.01);
      assertEquals((-3713.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Conta conta0 = new Conta("", 0.0);
      try { 
        conta0.creditar(0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Conta conta0 = new Conta(":v.v-M12a]TW%y", 1.0);
      double double0 = conta0.creditar(1.0);
      assertEquals(2.0, conta0.getSaldo(), 0.01);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Conta conta0 = new Conta(":v.v-M12a]TW%y", 1.0);
      try { 
        conta0.debitar(0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Conta conta0 = new Conta("m[C\".'5Ge{Co", 1.0);
      conta0.transferir(conta0, 1.0);
      assertEquals(1.0, conta0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Conta conta0 = new Conta("m[C\".'5Ge{Co", 1.0);
      double double0 = conta0.getSaldo();
      assertEquals(1.0, double0, 0.01);
  }
}
