/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 17:57:08 GMT 2024
 */

package org.example.org.example;

import org.example.Conta;
import org.example.Conta_ESTest_scaffolding2;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Conta_ESTest22 extends Conta_ESTest_scaffolding2 {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Conta conta0 = new Conta("", (-2562.83187));
      try { 
        conta0.creditar((-2562.83187));
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
      Conta conta0 = new Conta("org.example.OperacaoIlegalException", (-5638.072));
      try { 
        conta0.debitar((-5638.072));
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
      Conta conta0 = new Conta("l%{khMn\"p'i", (-4353.16057));
      double double0 = conta0.getSaldo();
      assertEquals((-4353.16057), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Conta conta0 = new Conta("", 1.0);
      double double0 = conta0.debitar(1.0);
      assertEquals(0.0, conta0.getSaldo(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Conta conta0 = new Conta("org.example.OperacaoIlegalException", 1417.8854435986364);
      double double0 = conta0.debitar(212.553542183673);
      assertEquals(1205.3319014149633, conta0.getSaldo(), 0.01);
      assertEquals(1205.3319014149633, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Conta conta0 = new Conta("org.example.OperacaoIlegalException", (-5638.072));
      double double0 = conta0.creditar(3134.596197);
      assertEquals((-2503.4758030000003), conta0.getSaldo(), 0.01);
      assertEquals((-2503.4758030000003), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Conta conta0 = new Conta("yG@hMIy", 557.2624944251313);
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
  public void test07()  throws Throwable  {
      Conta conta0 = new Conta("yG@hMIy", 557.2624944251313);
      double double0 = conta0.creditar(557.2624944251313);
      assertEquals(1114.5249888502626, conta0.getSaldo(), 0.01);
      assertEquals(1114.5249888502626, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Conta conta0 = new Conta("yG@hMIy", 557.2624944251313);
      conta0.debitar(1114.5249888502626);
      conta0.creditar(557.2624944251313);
      double double0 = conta0.getSaldo();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Conta conta0 = new Conta("yG@hMIy", 557.2624944251313);
      try { 
        conta0.transferir(conta0, 0.0);
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
      Conta conta0 = new Conta("", 0.0);
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
  public void test11()  throws Throwable  {
      Conta conta0 = new Conta("yG@hMIy", 557.2624944251313);
      conta0.transferir(conta0, 557.2624944251313);
      assertEquals(557.2624944251313, conta0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Conta conta0 = new Conta("yG@hMIy", 557.2624944251313);
      double double0 = conta0.getSaldo();
      assertEquals(557.2624944251313, double0, 0.01);
  }
}