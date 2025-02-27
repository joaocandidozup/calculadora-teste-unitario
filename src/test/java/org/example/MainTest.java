package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {

    @Test
    public void testSomaSucess() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 1;
        String resultadoEsperado = "O resultado de 10,0 + 5,0 = 15,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testSomaFail() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 1;
        String resultadoNaoEsperado = "O resultado de 10,0 + 5,0 = 20,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
}
