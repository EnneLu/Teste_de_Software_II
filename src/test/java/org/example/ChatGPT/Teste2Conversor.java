package org.example.ChatGPT;
import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste2Conversor {
    @Test
    void testConverteCelsiusParaFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Temperatura celsius = new Celsius();
        celsius.setValue(0.0); // 0 graus Celsius

        Temperatura fahrenheit = conversor.converte(celsius);

        assertEquals(32.0, fahrenheit.getValue(), "0 Celsius deve ser igual a 32 Fahrenheit");
    }

    @Test
    void testConverteFahrenheitParaCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Temperatura fahrenheit = new Fahrenheit();
        fahrenheit.setValue(32.0); // 32 Fahrenheit

        Temperatura celsius = conversor.converte(fahrenheit);

        // Com o bug na fórmula, este teste vai falhar, mas o valor esperado é 0
        assertEquals(0.0, celsius.getValue(), "32 Fahrenheit deve ser igual a 0 Celsius");
    }

    @Test
    void testConverteCelsiusNegativoParaFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Temperatura celsius = new Celsius();
        celsius.setValue(-40.0); // -40 graus Celsius

        Temperatura fahrenheit = conversor.converte(celsius);

        assertEquals(-40.0, fahrenheit.getValue(), "-40 Celsius deve ser igual a -40 Fahrenheit");
    }

    @Test
    void testConverteFahrenheitNegativoParaCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Temperatura fahrenheit = new Fahrenheit();
        fahrenheit.setValue(-40.0); // -40 Fahrenheit

        Temperatura celsius = conversor.converte(fahrenheit);

        assertEquals(-40.0, celsius.getValue(), "-40 Fahrenheit deve ser igual a -40 Celsius");
    }

    @Test
    void testConverteComExcecao() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Temperatura temp = new Celsius();
        temp.setValue(Double.NaN); // Valor inválido

        assertThrows(TempException.class, () -> conversor.converte(temp), "Deve lançar TempException para valor inválido");
    }
}
