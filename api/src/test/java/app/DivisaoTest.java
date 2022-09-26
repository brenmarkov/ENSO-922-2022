package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisaoTest {
     Divisao divisao;

     @BeforeEach
     public void antesTeste(){
       divisao = new Divisao();
     }

     @AfterEach
     public void depoisTeste(){
        System.out.println("Resulatdo finais dos teses");
     }

    @Test
    public void valoresGrandes(){
        double resultado = divisao.calculaRaiz(1000, 5);
        assertEquals(200,resultado);

    }

    @Test
    public void valoresnegativos(){
        double resultado = divisao.calculaRaiz(82, -2);
        assertEquals(-41,resultado);

    }

    @Test
    public void dizimaPeriodica(){
        double resultado = divisao.calculaRaiz(90, -3);
        assertEquals(-30,resultado);

    }
}