package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Multiplicacao;

public class MultiplicacaoTest{
    
    Multiplicacao multiplicacao;

    @BeforeEach
    public void antesTeste(){
        multiplicacao = new Multiplicacao();
    }

    @AfterEach
    public void depoisTeste(){
        System.out.println("Valor após teste");
    }

    @Test
    public void numerosPositivoNegativo(){
        double r1 = multiplicacao.calculaProduto(100.0, -5.0);
        assertEquals(-500.0, r1);
    }   

    @Test   
    public void numerosNegativos(){
        double r1 = multiplicacao.calculaProduto(-6.0, -6.0);
        assertEquals(36.0, r1);

    }

    @Test
    public void operacoesNulas(){
        double r1 = multiplicacao.calculaProduto(0.0, 0.0);
        assertEquals(0.0,r1);
    }
}