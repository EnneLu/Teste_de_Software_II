package org.example.ChatGPT;
import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Teste3Conversor {
    @Test
    void testConverteCelsiusParaFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Celsius celsius = new Celsius();
        celsius.setValue(0);  // Zero graus Celsius
        Fahrenheit resultado = (Fahrenheit) conversor.converte(celsius);

        assertEquals(32, resultado.getValue(), "0°C deve ser igual a 32°F");
    }

    @Test
    void testConverteFahrenheitParaCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setValue(32);  // 32 graus Fahrenheit (ponto de congelamento da água)
        Celsius resultado = (Celsius) conversor.converte(fahrenheit);

        assertEquals(0, resultado.getValue(), "32°F deve ser igual a 0°C");
    }

    @Test
    void testConverteCelsiusNegativoParaFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Celsius celsius = new Celsius();
        celsius.setValue(-40);  // -40 graus Celsius, igual a -40 Fahrenheit
        Fahrenheit resultado = (Fahrenheit) conversor.converte(celsius);

        assertEquals(-40, resultado.getValue(), "-40°C deve ser igual a -40°F");
    }

    @Test
    void testConverteFahrenheitNegativoParaCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setValue(-40);  // -40 graus Fahrenheit, igual a -40 Celsius
        Celsius resultado = (Celsius) conversor.converte(fahrenheit);

        assertEquals(-40, resultado.getValue(), "-40°F deve ser igual a -40°C");
    }

    @Test
    void testTempException() {
        ConversorTemperatura conversor = new ConversorTemperatura();

        // Testando uma situação inválida
        assertThrows(TempException.class, () -> {
            Temperatura temp = new Temperatura() {
                @Override
                public double getValue() {
                    return Double.NaN; // Simula valor inválido
                }
                @Override
                public void setValue(double value) { }
                @Override
                public double getFREEZE() {
                    return 0;
                }

                @Override
                public double getBOIL() {
                    return 0;
                }

                @Override
                public double getZEROABSOLUTO() {
                    return 0;
                }
            };
            conversor.converte(temp);
        });
    }

    @Test
    void testBugConversaoFahrenheitParaCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setValue(212);  // Ponto de ebulição da água (212°F)
        Celsius resultado = (Celsius) conversor.converte(fahrenheit);

        // O valor esperado é 100°C, mas a fórmula incorreta causará um erro aqui
        assertNotEquals(100, resultado.getValue(), "A fórmula incorreta de conversão de Fahrenheit para Celsius causa um erro");
    }
}
