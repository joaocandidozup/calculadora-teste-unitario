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
    @Test
    public void testSubtracaoSucess() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 2;
        String resultadoEsperado = "O resultado de 10,0 - 5,0 = 5,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testSubtracaoFail() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 2;
        String resultadoNaoEsperado = "O resultado de 10,0 - 5,0 = 3,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
    @Test
    public void testMultiplicacaoSucess() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 3;
        String resultadoEsperado = "O resultado de 10,0 x 5,0 = 50,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testMultiplicacaoFail() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 3;
        String resultadoNaoEsperado = "O resultado de 10,0 x 5,0 = 5,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
    @Test
    public void testDivisao() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 4;
        String resultadoEsperado = "O resultado de 10,0 / 5,0 = 2,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testDivisaoFail() {
        // Arrange
        double numero1 = 10;
        double numero2 = 5;
        int operacao = 3;
        String resultadoNaoEsperado = "O resultado de 10,0 / 5,0 = 3,0";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
    @Test
    public void testDivisaoPorZero() {
        // Arrange
        double numero1 = 10;
        double numero2 = 0;
        int operacao = 4;
        String resultadoEsperado = "O resultado de 10,0 / 0,0 é uma operação matemática indefinida!!!";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testDivisaoPorZeroFail() {
        // Arrange
        double numero1 = 10;
        double numero2 = 0;
        int operacao = 4;
        String resultadoNaoEsperado = "O resultado de 10,0 / 0,0 é uma operacao valida";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
    @Test
    public void testOperacaoInvalida() {
        // Arrange
        double numero1 = 10;
        double numero2 = 0;
        int operacao = 9;
        String resultadoEsperado = "Operação inválida!!!";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testOperacaoInvalidaFail() {
        // Arrange
        double numero1 = 10;
        double numero2 = 0;
        int operacao = 9;
        String resultadoNaoEsperado = "Operação valida!!!";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
    @Test
    public void testSairDaAplicacaoSucess() {
        // Arrange
        double numero1 = 10;
        double numero2 = 0;
        int operacao = 0;
        String resultadoEsperado = "OK SAINDO DA APLICAÇÃO ................";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testSairDaAplicacaoFail() {
        // Arrange
        double numero1 = 10;
        double numero2 = 0;
        int operacao = 0;
        String resultadoNaoEsperado = " ";

        // Act
        String resultado = Main.calcular(numero1, numero2, operacao);

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
    @Test
    public void testMenu() {
        // Arrange
        String resultadoEsperado = """
                \nOperações:
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                0 - Sair
                """;

        // Act
        String resultado = Main.menu();

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testMenuFail() {
        // Arrange
        String resultadoNaoEsperado = """
                \nOperações:
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - nova opcao
                0 - Sair
                """;

        // Act
        String resultado = Main.menu();

        // Assert
        assertNotEquals(resultadoNaoEsperado, resultado);
    }
    @Test
    public void nomeDaAplicacaoSucess() {
        // Arrange
        String resultadoEsperado = "########## Calculadora do João ##########";

        // Act
        String resultado = Main.nomeDaAplicacao();

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
}
