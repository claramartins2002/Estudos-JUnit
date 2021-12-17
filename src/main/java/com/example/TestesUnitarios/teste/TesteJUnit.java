package com.example.TestesUnitarios.teste;

import com.example.TestesUnitarios.classe.Calculadora;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TesteJUnit {
    @Test
    public void testeSoma(){
        Calculadora calc = new Calculadora();
        boolean temErro = false;

        if(calc.soma(2,2) != 4){
            temErro = true;
        }
        if(calc.soma(2,-2) != 0){
            temErro = true;
        }
        if(calc.soma(-2,-2) != -4){
            temErro = true;
        }
        if(calc.soma(0,0) != 0){
            temErro = true;
        }
        if(temErro){
            fail("Houve um erro na validação da soma");
        }
    }

    @Test
    public void deveResultarQuatroAoSomarDoisEDois(){
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.soma(2,2), 0.0);
        }
    @Test
    public void deveResultarZeroAoSomarDoisEMenosDois(){
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.soma(2,-2), 0.0);
    }



}
