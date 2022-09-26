package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubtracaoTest{
    
    Subtracao subtracao;

    @BeforeEach
    public void antesTeste(){
      subtracao = new Subtracao();
    }

    @AfterEach
    public void depoisTeste(){
        System.out.println("Valor após teste");
    }

    @Test
    public void valoresNegativos(){
        double n1 = subtracao.calculaRaiz(-16.0, -12.0);
        assertEquals(-4.0, n1);
    }   

    @Test   
    public void valoresNulos(){
        double n1 = subtracao.calculaRaiz(0.0, 0.0);
        assertEquals(0.0, n1);
    }

    @Test
    public void valorPositivoNegativo(){
        double n1 = subtracao.calculaRaiz(6, -15); 
        assertEquals(21.0,n1);
    }
}