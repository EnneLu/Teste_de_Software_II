package org.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Teste2Conta {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        org.example.Conta conta5 = new org.example.Conta("hi!", (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta5, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar((double) 10);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta7, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double6 = conta2.debitar((double) 1.0f);
        java.lang.Class<?> wildcardClass7 = conta2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.0d + "'", double6 == 29.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = conta2.debitar((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double6 = conta2.debitar((double) 1.0f);
        double double7 = conta2.getSaldo();
        java.lang.Class<?> wildcardClass8 = conta2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.0d + "'", double6 == 29.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 29.0d + "'", double7 == 29.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        org.example.Conta conta15 = new org.example.Conta("hi!", (double) (byte) 10);
        double double17 = conta15.creditar(20.0d);
        org.example.Conta conta20 = new org.example.Conta("hi!", (double) (byte) 10);
        double double22 = conta20.creditar(20.0d);
        double double23 = conta20.getSaldo();
        conta15.transferir(conta20, (double) 10L);
        double double26 = conta20.getSaldo();
        double double28 = conta20.debitar((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            conta7.transferir(conta20, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 29.0d + "'", double28 == 29.0d);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10L);
        org.example.Conta conta5 = new org.example.Conta("hi!", (double) (byte) 10);
        double double7 = conta5.creditar(20.0d);
        org.example.Conta conta10 = new org.example.Conta("hi!", (double) (byte) 10);
        double double12 = conta10.creditar(20.0d);
        double double13 = conta10.getSaldo();
        conta5.transferir(conta10, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        java.lang.Class<?> wildcardClass6 = conta2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = conta2.debitar((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double6 = conta2.debitar((double) 1.0f);
        double double7 = conta2.getSaldo();
        org.example.Conta conta10 = new org.example.Conta("hi!", (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.0d + "'", double6 == 29.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 29.0d + "'", double7 == 29.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10L);
        double double3 = conta2.getSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.example.Conta conta2 = new org.example.Conta("", (double) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (byte) 10);
        double double10 = conta8.creditar((double) 10);
        double double11 = conta8.getSaldo();
        conta2.transferir(conta8, 61.0d);
        org.example.Conta conta16 = new org.example.Conta("hi!", (double) (byte) 10);
        double double18 = conta16.creditar(20.0d);
        double double20 = conta16.debitar((double) 1.0f);
        conta2.transferir(conta16, (double) 100L);
        org.example.Conta conta25 = new org.example.Conta("hi!", (double) (byte) 10);
        double double27 = conta25.creditar(20.0d);
        double double28 = conta25.getSaldo();
        org.example.Conta conta31 = new org.example.Conta("hi!", (double) (byte) 10);
        double double33 = conta31.creditar((double) 10);
        double double34 = conta31.getSaldo();
        conta25.transferir(conta31, 61.0d);
        conta16.transferir(conta31, (double) 10.0f);
        java.lang.Class<?> wildcardClass39 = conta16.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 29.0d + "'", double20 == 29.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 30.0d + "'", double27 == 30.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 30.0d + "'", double28 == 30.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 20.0d + "'", double33 == 20.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 20.0d + "'", double34 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = conta2.creditar((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (short) -1);
        double double3 = conta2.getSaldo();
        org.example.Conta conta6 = new org.example.Conta("hi!", (double) 0);
        double double8 = conta6.creditar(30.0d);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta6, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (byte) 10);
        double double10 = conta8.creditar((double) 10);
        double double11 = conta8.getSaldo();
        conta2.transferir(conta8, 61.0d);
        double double14 = conta2.getSaldo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        double double13 = conta7.getSaldo();
        java.lang.Class<?> wildcardClass14 = conta7.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10L);
        java.lang.Class<?> wildcardClass3 = conta2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) 0);
        double double4 = conta2.creditar(30.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = conta2.debitar(0.0d);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        double double13 = conta7.getSaldo();
        double double15 = conta7.debitar((double) (byte) 1);
        java.lang.Class<?> wildcardClass16 = conta7.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 29.0d + "'", double15 == 29.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        java.lang.Class<?> wildcardClass13 = conta7.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = conta2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        double double6 = conta2.getSaldo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        double double13 = conta7.getSaldo();
        double double15 = conta7.debitar((double) (byte) 1);
        double double17 = conta7.creditar((double) ' ');
        java.lang.Class<?> wildcardClass18 = conta7.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 29.0d + "'", double15 == 29.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 61.0d + "'", double17 == 61.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (short) -1);
        double double4 = conta2.debitar((double) (short) 10);
        double double6 = conta2.creditar(10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-11.0d) + "'", double4 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.example.Conta conta2 = new org.example.Conta("", (double) (short) 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        org.example.Conta conta5 = new org.example.Conta("hi!", (double) (byte) 10);
        double double7 = conta5.creditar(20.0d);
        double double8 = conta5.getSaldo();
        org.example.Conta conta11 = new org.example.Conta("hi!", (double) (short) -1);
        double double13 = conta11.debitar((double) (short) 10);
        conta5.transferir(conta11, 20.0d);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta11, (-23.0d));
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-11.0d) + "'", double13 == (-11.0d));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (byte) 10);
        double double10 = conta8.creditar((double) 10);
        double double11 = conta8.getSaldo();
        conta2.transferir(conta8, 61.0d);
        double double15 = conta8.creditar((double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 72.0d + "'", double15 == 72.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (short) -1);
        double double10 = conta8.debitar((double) (short) 10);
        conta2.transferir(conta8, 20.0d);
        org.example.Conta conta15 = new org.example.Conta("hi!", (double) 0.0f);
        conta8.transferir(conta15, 30.0d);
        double double19 = conta15.creditar((double) 100.0f);
        java.lang.Class<?> wildcardClass20 = conta15.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = conta2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (short) -1);
        double double4 = conta2.debitar((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = conta2.creditar((double) 0);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-11.0d) + "'", double4 == (-11.0d));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double6 = conta2.debitar((double) 1.0f);
        double double8 = conta2.debitar((double) '4');
        double double9 = conta2.getSaldo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.0d + "'", double6 == 29.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-23.0d) + "'", double8 == (-23.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-23.0d) + "'", double9 == (-23.0d));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.example.Conta conta2 = new org.example.Conta("", 61.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        double double13 = conta7.getSaldo();
        double double15 = conta7.debitar((double) (byte) 1);
        double double17 = conta7.creditar((double) 1);
        java.lang.Class<?> wildcardClass18 = conta7.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 29.0d + "'", double15 == 29.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar((double) 10);
        java.lang.Class<?> wildcardClass5 = conta2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.example.Conta conta2 = new org.example.Conta("", 0.0d);
        java.lang.Class<?> wildcardClass3 = conta2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double6 = conta2.debitar((double) 1.0f);
        double double7 = conta2.getSaldo();
        double double8 = conta2.getSaldo();
        double double9 = conta2.getSaldo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.0d + "'", double6 == 29.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 29.0d + "'", double7 == 29.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 29.0d + "'", double8 == 29.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 29.0d + "'", double9 == 29.0d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) 0.0f);
        double double4 = conta2.creditar((double) 10);
        double double5 = conta2.getSaldo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10);
        org.example.Conta conta5 = new org.example.Conta("hi!", (double) (byte) 10);
        double double7 = conta5.creditar(20.0d);
        double double8 = conta5.getSaldo();
        org.example.Conta conta11 = new org.example.Conta("hi!", (double) (byte) 10);
        double double13 = conta11.creditar((double) 10);
        double double14 = conta11.getSaldo();
        conta5.transferir(conta11, 61.0d);
        org.example.Conta conta19 = new org.example.Conta("hi!", (double) (byte) 10);
        double double21 = conta19.creditar(20.0d);
        double double23 = conta19.debitar((double) 1.0f);
        conta5.transferir(conta19, (double) 100L);
        org.example.Conta conta28 = new org.example.Conta("hi!", (double) (byte) 10);
        double double30 = conta28.creditar(20.0d);
        double double31 = conta28.getSaldo();
        org.example.Conta conta34 = new org.example.Conta("hi!", (double) (byte) 10);
        double double36 = conta34.creditar((double) 10);
        double double37 = conta34.getSaldo();
        conta28.transferir(conta34, 61.0d);
        conta19.transferir(conta34, (double) 10.0f);
        conta2.transferir(conta34, (double) ' ');
        double double44 = conta2.getSaldo();
        org.example.Conta conta47 = new org.example.Conta("hi!", (double) (byte) 10);
        double double49 = conta47.creditar((double) 10);
        double double50 = conta47.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta47, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 29.0d + "'", double23 == 29.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 30.0d + "'", double30 == 30.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 30.0d + "'", double31 == 30.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 20.0d + "'", double37 == 20.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 20.0d + "'", double49 == 20.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 20.0d + "'", double50 == 20.0d);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = conta2.debitar((double) 0);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.example.Conta conta2 = new org.example.Conta("", 0.0d);
        org.example.Conta conta5 = new org.example.Conta("hi!", (double) (byte) 10);
        double double7 = conta5.creditar(20.0d);
        double double8 = conta5.getSaldo();
        org.example.Conta conta11 = new org.example.Conta("hi!", (double) (byte) 10);
        double double13 = conta11.creditar((double) 10);
        double double14 = conta11.getSaldo();
        conta5.transferir(conta11, 61.0d);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta11, (-23.0d));
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10L);
        double double4 = conta2.debitar((double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-90.0d) + "'", double4 == (-90.0d));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        org.example.Conta conta15 = new org.example.Conta("hi!", (double) 0.0f);
        conta2.transferir(conta15, (double) 1.0f);
        java.lang.Class<?> wildcardClass18 = conta2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(100.0d);
        java.lang.Class<?> wildcardClass5 = conta2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 110.0d + "'", double4 == 110.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        org.example.Conta conta15 = new org.example.Conta("hi!", (double) 0.0f);
        conta2.transferir(conta15, (double) 1.0f);
        org.example.Conta conta20 = new org.example.Conta("hi!", (double) (byte) 10);
        double double22 = conta20.creditar(20.0d);
        double double23 = conta20.getSaldo();
        org.example.Conta conta26 = new org.example.Conta("hi!", (double) (short) -1);
        double double28 = conta26.debitar((double) (short) 10);
        conta20.transferir(conta26, 20.0d);
        double double32 = conta26.debitar((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            conta15.transferir(conta26, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-11.0d) + "'", double28 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-46.0d) + "'", double32 == (-46.0d));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (byte) 10);
        double double10 = conta8.creditar((double) 10);
        double double11 = conta8.getSaldo();
        conta2.transferir(conta8, 61.0d);
        org.example.Conta conta16 = new org.example.Conta("hi!", (double) (byte) 10);
        double double18 = conta16.creditar(20.0d);
        double double20 = conta16.debitar((double) 1.0f);
        conta2.transferir(conta16, (double) 100L);
        org.example.Conta conta25 = new org.example.Conta("hi!", (double) (byte) 10);
        double double27 = conta25.creditar(20.0d);
        org.example.Conta conta30 = new org.example.Conta("hi!", (double) (byte) 10);
        double double32 = conta30.creditar(20.0d);
        double double33 = conta30.getSaldo();
        conta25.transferir(conta30, (double) 10L);
        double double36 = conta30.getSaldo();
        double double38 = conta30.debitar((double) (byte) 1);
        double double40 = conta30.creditar((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            conta2.transferir(conta30, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 29.0d + "'", double20 == 29.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 30.0d + "'", double27 == 30.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 30.0d + "'", double32 == 30.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 30.0d + "'", double33 == 30.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 30.0d + "'", double36 == 30.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 29.0d + "'", double38 == 29.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 30.0d + "'", double40 == 30.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        double double13 = conta7.getSaldo();
        double double15 = conta7.debitar((double) (byte) 1);
        double double16 = conta7.getSaldo();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 29.0d + "'", double15 == 29.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 29.0d + "'", double16 == 29.0d);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (byte) 10);
        double double10 = conta8.creditar((double) 10);
        double double11 = conta8.getSaldo();
        conta2.transferir(conta8, 61.0d);
        double double14 = conta8.getSaldo();
        java.lang.Class<?> wildcardClass15 = conta8.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        double double13 = conta7.getSaldo();
        double double15 = conta7.debitar((double) (byte) 1);
        double double17 = conta7.creditar((double) 1);
        org.example.Conta conta20 = new org.example.Conta("hi!", (double) (byte) 10);
        double double22 = conta20.creditar(20.0d);
        org.example.Conta conta25 = new org.example.Conta("hi!", (double) (byte) 10);
        double double27 = conta25.creditar(20.0d);
        double double28 = conta25.getSaldo();
        conta20.transferir(conta25, (double) 10L);
        conta7.transferir(conta20, (double) 'a');
        double double34 = conta20.debitar((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 29.0d + "'", double15 == 29.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 30.0d + "'", double27 == 30.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 30.0d + "'", double28 == 30.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 29.0d + "'", double34 == 29.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (byte) 10);
        double double10 = conta8.creditar((double) 10);
        double double11 = conta8.getSaldo();
        conta2.transferir(conta8, 61.0d);
        double double14 = conta8.getSaldo();
        double double16 = conta8.debitar((double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10);
        org.example.Conta conta5 = new org.example.Conta("hi!", (double) (byte) 10);
        double double7 = conta5.creditar(20.0d);
        double double8 = conta5.getSaldo();
        org.example.Conta conta11 = new org.example.Conta("hi!", (double) (byte) 10);
        double double13 = conta11.creditar((double) 10);
        double double14 = conta11.getSaldo();
        conta5.transferir(conta11, 61.0d);
        org.example.Conta conta19 = new org.example.Conta("hi!", (double) (byte) 10);
        double double21 = conta19.creditar(20.0d);
        double double23 = conta19.debitar((double) 1.0f);
        conta5.transferir(conta19, (double) 100L);
        org.example.Conta conta28 = new org.example.Conta("hi!", (double) (byte) 10);
        double double30 = conta28.creditar(20.0d);
        double double31 = conta28.getSaldo();
        org.example.Conta conta34 = new org.example.Conta("hi!", (double) (byte) 10);
        double double36 = conta34.creditar((double) 10);
        double double37 = conta34.getSaldo();
        conta28.transferir(conta34, 61.0d);
        conta19.transferir(conta34, (double) 10.0f);
        conta2.transferir(conta34, (double) ' ');
        java.lang.Class<?> wildcardClass44 = conta2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 29.0d + "'", double23 == 29.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 30.0d + "'", double30 == 30.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 30.0d + "'", double31 == 30.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 20.0d + "'", double37 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        double double10 = conta7.getSaldo();
        conta2.transferir(conta7, (double) 10L);
        double double13 = conta7.getSaldo();
        double double15 = conta7.debitar((double) (byte) 1);
        double double17 = conta7.creditar((double) 1);
        double double19 = conta7.debitar(72.0d);
        double double21 = conta7.creditar((double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 29.0d + "'", double15 == 29.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-42.0d) + "'", double19 == (-42.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-41.0d) + "'", double21 == (-41.0d));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (short) -1);
        double double10 = conta8.debitar((double) (short) 10);
        conta2.transferir(conta8, 20.0d);
        org.example.Conta conta15 = new org.example.Conta("hi!", (double) 0.0f);
        conta8.transferir(conta15, 30.0d);
        double double19 = conta8.debitar(72.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-83.0d) + "'", double19 == (-83.0d));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar(20.0d);
        double double5 = conta2.getSaldo();
        org.example.Conta conta8 = new org.example.Conta("hi!", (double) (byte) 10);
        double double10 = conta8.creditar((double) 10);
        double double11 = conta8.getSaldo();
        conta2.transferir(conta8, 61.0d);
        org.example.Conta conta16 = new org.example.Conta("hi!", (double) (byte) 10);
        double double18 = conta16.creditar(20.0d);
        double double20 = conta16.debitar((double) 1.0f);
        conta2.transferir(conta16, (double) 100L);
        double double24 = conta16.creditar((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 29.0d + "'", double20 == 29.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 100);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.creditar((double) 10);
        org.example.Conta conta7 = new org.example.Conta("hi!", (double) (byte) 10);
        double double9 = conta7.creditar(20.0d);
        org.example.Conta conta12 = new org.example.Conta("hi!", (double) (byte) 10);
        double double14 = conta12.creditar(20.0d);
        double double15 = conta12.getSaldo();
        conta7.transferir(conta12, (double) 10L);
        double double18 = conta12.getSaldo();
        double double20 = conta12.debitar((double) (byte) 1);
        double double22 = conta12.creditar((double) 1);
        conta2.transferir(conta12, 61.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 29.0d + "'", double20 == 29.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10.0f);
        double double3 = conta2.getSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.example.Conta conta2 = new org.example.Conta("", (double) 10);
        org.example.Conta conta5 = new org.example.Conta("hi!", (double) (byte) 10);
        double double7 = conta5.creditar(20.0d);
        double double8 = conta5.getSaldo();
        org.example.Conta conta11 = new org.example.Conta("hi!", (double) (byte) 10);
        double double13 = conta11.creditar((double) 10);
        double double14 = conta11.getSaldo();
        conta5.transferir(conta11, 61.0d);
        org.example.Conta conta19 = new org.example.Conta("hi!", (double) (byte) 10);
        double double21 = conta19.creditar(20.0d);
        double double23 = conta19.debitar((double) 1.0f);
        conta5.transferir(conta19, (double) 100L);
        org.example.Conta conta28 = new org.example.Conta("hi!", (double) (byte) 10);
        double double30 = conta28.creditar(20.0d);
        double double31 = conta28.getSaldo();
        org.example.Conta conta34 = new org.example.Conta("hi!", (double) (byte) 10);
        double double36 = conta34.creditar((double) 10);
        double double37 = conta34.getSaldo();
        conta28.transferir(conta34, 61.0d);
        conta19.transferir(conta34, (double) 10.0f);
        conta2.transferir(conta34, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double45 = conta34.debitar((-41.0d));
            org.junit.Assert.fail("Expected exception of type org.example.OperacaoIlegalException; message: null");
        } catch (org.example.OperacaoIlegalException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 29.0d + "'", double23 == 29.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 30.0d + "'", double30 == 30.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 30.0d + "'", double31 == 30.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 20.0d + "'", double37 == 20.0d);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.example.Conta conta2 = new org.example.Conta("hi!", (double) (byte) 10);
        double double4 = conta2.debitar(72.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-62.0d) + "'", double4 == (-62.0d));
    }
}

