package org.example.ChatGPT;
import org.example.OperacaoIlegalException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Conta;

public class Teste2Conta {
    private Conta contaOrigem;
    private Conta contaDestino;

    @BeforeEach
    void setUp() {
        // Inicializando contas com saldo inicial
        contaOrigem = new Conta("123", 1000.0);
        contaDestino = new Conta("456", 500.0);
    }

    // Testando o débito válido
    @Test
    void testDebitarValorPositivo() throws OperacaoIlegalException {
        double saldoAtual = contaOrigem.debitar(100.0);
        assertEquals(900.0, saldoAtual);
    }

    // Testando débito com valor negativo (lança exceção)
    @Test
    void testDebitarValorNegativo() {
        assertThrows(OperacaoIlegalException.class, () -> {
            contaOrigem.debitar(-100.0);
        });
    }

    // Testando o crédito válido
    @Test
    void testCreditarValorPositivo() throws OperacaoIlegalException {
        double saldoAtual = contaOrigem.creditar(200.0);
        assertEquals(1200.0, saldoAtual);
    }

    // Testando crédito com valor negativo (lança exceção)
    @Test
    void testCreditarValorNegativo() {
        assertThrows(OperacaoIlegalException.class, () -> {
            contaOrigem.creditar(-200.0);
        });
    }

    // Testando transferência válida entre contas
    @Test
    void testTransferenciaValida() throws OperacaoIlegalException {
        contaOrigem.transferir(contaDestino, 300.0);
        assertEquals(700.0, contaOrigem.getSaldo());
        assertEquals(800.0, contaDestino.getSaldo());
    }

    // Testando transferência com valor maior que o saldo da conta origem (lança exceção)
    @Test
    void testTransferenciaValorMaiorQueSaldo() {
        assertThrows(OperacaoIlegalException.class, () -> {
            contaOrigem.transferir(contaDestino, 1500.0);
        });
    }

    // Testando transferência com valor negativo (lança exceção)
    @Test
    void testTransferenciaValorNegativo() {
        assertThrows(OperacaoIlegalException.class, () -> {
            contaOrigem.transferir(contaDestino, -300.0);
        });
    }
}
