package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class SomaTest{
    
    Adicao adicao;

    @BeforeEach
    public void antesTeste(){
        adicao = new Adicao();
    }

    @AfterEach
    public void depoisTeste(){
        System.out.println("Valor depois do teste: ");
    }

    @Test
    public void valoresNegativos(){
        double r1 = adicao.calculaAdicao(-12.0, -2.0);
        assertEquals(-14.0, r1);
    }   

    @Test   
    public void valoresNulos(){
        double r1 = adicao.calculaAdicao(0.0, 0.0);
        assertEquals(0.0, r1);

    }

    @Test
    public void valorPositivoNegativo(){
        double r1 = adicao.calculaAdicao(3, -5);
        assertEquals(-2,r1);
    }
}