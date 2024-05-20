package sptech.school.atividadecicd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
    void dividir() {

        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;

        double resultado = calculadoraService.dividir(a, b);

        assertEquals(5, resultado);
    }
}