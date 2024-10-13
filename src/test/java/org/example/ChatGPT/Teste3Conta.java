package org.example.ChatGPT;
import org.example.OperacaoIlegalException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Conta;

public class Teste3Conta {
    @Test
    void testSaldoInicial() {
        Conta conta = new Conta("123", 100.0);
        assertEquals(100.0, conta.getSaldo(), "O saldo inicial deve ser 100");
    }

    @Test
    void testDebitarValorPositivo() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 100.0);
        double novoSaldo = conta.debitar(50.0);
        assertEquals(50.0, novoSaldo, "O saldo deve ser 50 após debitar 50");
    }

    @Test
    void testDebitarValorNegativo() {
        Conta conta = new Conta("123", 100.0);
        assertThrows(OperacaoIlegalException.class, () -> conta.debitar(-50.0), "Deve lançar OperacaoIlegalException para valor negativo");
    }

    @Test
    void testCreditarValorPositivo() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 100.0);
        double novoSaldo = conta.creditar(50.0);
        assertEquals(150.0, novoSaldo, "O saldo deve ser 150 após creditar 50");
    }

    @Test
    void testCreditarValorNegativo() {
        Conta conta = new Conta("123", 100.0);
        assertThrows(OperacaoIlegalException.class, () -> conta.creditar(-50.0), "Deve lançar OperacaoIlegalException para valor negativo");
    }

    @Test
    void testTransferirComSucesso() throws OperacaoIlegalException {
        Conta origem = new Conta("123", 100.0);
        Conta destino = new Conta("456", 50.0);

        origem.transferir(destino, 30.0);

        assertEquals(70.0, origem.getSaldo(), "O saldo da conta origem deve ser 70 após a transferência");
        assertEquals(80.0, destino.getSaldo(), "O saldo da conta destino deve ser 80 após a transferência");
    }

    @Test
    void testTransferirValorSuperiorAoSaldo() {
        Conta origem = new Conta("123", 100.0);
        Conta destino = new Conta("456", 50.0);

        assertThrows(OperacaoIlegalException.class, () -> origem.transferir(destino, 150.0), "Deve lançar exceção para transferência de valor superior ao saldo");
    }

    @Test
    void testTransferirValorNegativo() {
        Conta origem = new Conta("123", 100.0);
        Conta destino = new Conta("456", 50.0);

        assertThrows(OperacaoIlegalException.class, () -> origem.transferir(destino, -50.0), "Deve lançar exceção para transferência de valor negativo");
    }
}
