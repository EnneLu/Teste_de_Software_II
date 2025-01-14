/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 17:10:04 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.Conta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Conta_ESTest extends Conta_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Conta conta0 = new Conta("", 0.0);
      try { 
        conta0.transferir((Conta) null, (-1.0));
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
  public void test02()  throws Throwable  {
      Conta conta0 = new Conta("", 0.0);
      double double0 = conta0.getSaldo();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Conta conta0 = new Conta("<q~<J", (-1.0));
      double double0 = conta0.getSaldo();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Conta conta0 = new Conta("@kP$o19R", 1.0);
      double double0 = conta0.debitar(1.0);
      assertEquals(0.0, conta0.getSaldo(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Conta conta0 = new Conta("", 0.0);
      conta0.debitar(1658.21);
      double double0 = conta0.creditar(1658.21);
      assertEquals(0.0, conta0.getSaldo(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Conta conta0 = new Conta("org.example.OperacaoIlegalException", (-684.11197915));
      double double0 = conta0.creditar(1.0);
      assertEquals((-683.11197915), conta0.getSaldo(), 0.01);
      assertEquals((-683.11197915), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Conta conta0 = new Conta("", (-1.0));
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
      Conta conta0 = new Conta("", 0.0);
      double double0 = conta0.creditar(1658.21);
      assertEquals(1658.21, conta0.getSaldo(), 0.01);
      assertEquals(1658.21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Conta conta0 = new Conta("<?i/7IeN9L-*G", 2673.93);
      double double0 = conta0.debitar(825.0015);
      assertEquals(1848.9285, conta0.getSaldo(), 0.01);
      assertEquals(1848.9285, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Conta conta0 = new Conta("L9n&.$=qQ", 0.0);
      conta0.transferir(conta0, 1129.2353603336508);
      assertEquals(0.0, conta0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Conta conta0 = new Conta("L9n&.$=qQ", 0.0);
      try { 
        conta0.debitar((-1.0));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Conta conta0 = new Conta("N%5W#mf@zz$8oY$", 1063.203700401);
      double double0 = conta0.getSaldo();
      assertEquals(1063.203700401, double0, 0.01);
  }
}
