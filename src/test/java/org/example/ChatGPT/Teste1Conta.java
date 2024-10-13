package org.example.ChatGPT;
import org.example.OperacaoIlegalException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Conta;

public class Teste1Conta {

    // Testa o construtor da classe Conta
    @Test
    void testContaConstrutor() {
        Conta conta = new Conta("123", 100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    // Testa o método creditar com um valor positivo
    @Test
    void testCreditarValorPositivo() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 100.0);
        conta.creditar(50.0);
        assertEquals(150.0, conta.getSaldo());
    }

    // Testa o método creditar com um valor negativo (lança exceção)
    @Test
    void testCreditarValorNegativo() {
        Conta conta = new Conta("123", 100.0);
        assertThrows(OperacaoIlegalException.class, () -> {
            conta.creditar(-50.0);
        });
    }

    // Testa o método debitar com um valor positivo
    @Test
    void testDebitarValorPositivo() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 100.0);
        conta.debitar(50.0);
        assertEquals(50.0, conta.getSaldo());
    }

    // Testa o método debitar com um valor negativo (lança exceção)
    @Test
    void testDebitarValorNegativo() {
        Conta conta = new Conta("123", 100.0);
        assertThrows(OperacaoIlegalException.class, () -> {
            conta.debitar(-50.0);
        });
    }

    // Testa a transferência com valor válido
    @Test
    void testTransferirValorValido() throws OperacaoIlegalException {
        Conta origem = new Conta("001", 200.0);
        Conta destino = new Conta("002", 100.0);
        origem.transferir(destino, 50.0);

        assertEquals(150.0, origem.getSaldo());
        assertEquals(150.0, destino.getSaldo());
    }

    // Testa a transferência com valor superior ao saldo da conta origem (lança exceção)
    @Test
    void testTransferirValorSuperiorAoSaldo() {
        Conta origem = new Conta("001", 200.0);
        Conta destino = new Conta("002", 100.0);

        assertThrows(OperacaoIlegalException.class, () -> {
            origem.transferir(destino, 250.0);
        });
    }

    // Testa a transferência com valor negativo (lança exceção)
    @Test
    void testTransferirValorNegativo() {
        Conta origem = new Conta("001", 200.0);
        Conta destino = new Conta("002", 100.0);

        assertThrows(OperacaoIlegalException.class, () -> {
            origem.transferir(destino, -50.0);
        });
    }
}
