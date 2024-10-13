package org.example.ChatGPT;
import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste1Conversor {

    @Test
    void testConverteCelsiusParaFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Celsius celsius = new Celsius();
        celsius.setValue(0);  // 0°C

        Fahrenheit fahrenheit = (Fahrenheit) conversor.converte(celsius);
        assertEquals(32.0, fahrenheit.getValue(), 0.1, "0°C deve ser convertido para 32°F");
    }

    @Test
    void testConverteFahrenheitParaCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setValue(32);  // 32°F

        Celsius celsius = (Celsius) conversor.converte(fahrenheit);
        assertNotEquals(0.0, celsius.getValue(), "Devido ao bug na fórmula, 32°F não será convertido corretamente para 0°C");
    }

    @Test
    void testConverte100CelsiusParaFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Celsius celsius = new Celsius();
        celsius.setValue(100);  // 100°C

        Fahrenheit fahrenheit = (Fahrenheit) conversor.converte(celsius);
        assertEquals(212.0, fahrenheit.getValue(), 0.1, "100°C deve ser convertido para 212°F");
    }

    @Test
    void testConverte212FahrenheitParaCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setValue(212);  // 212°F

        Celsius celsius = (Celsius) conversor.converte(fahrenheit);
        assertNotEquals(100.0, celsius.getValue(), "Devido ao bug na fórmula, 212°F não será convertido corretamente para 100°C");
    }

    @Test
    void testConverteTempException() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Temperatura temperaturaInvalida = null;  // Representa uma entrada inválida

        assertThrows(TempException.class, () -> conversor.converte(temperaturaInvalida), "Deve lançar TempException para entrada inválida");
    }
}
