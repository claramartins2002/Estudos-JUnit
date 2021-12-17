package com.example.TestesUnitarios.teste;

import com.example.TestesUnitarios.classe.Calculadora;

public class TesteManual {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        if(temErroNaSoma(calculadora)){
            System.exit(1);
        }

        if(subtracaoEstaOK(calculadora) == false) {
            System.out.println("\n Houve um problema na validação da subtração ## \n\n");
            System.exit(1);
        }
        System.out.println("\n \n====> Todos os testes passaram <====\n\n");
        System.exit(0);
    }

    private static boolean temErroNaSoma(Calculadora calculadora){
        boolean temErro = false;

        if(calculadora.soma(2,2) != 4){
            temErro = true;
        }
        if(calculadora.soma(2,-2)!= 0){
            temErro = true;
        }
        if(calculadora.soma(-2,-2)!= -4){
            temErro = true;
        }
        if(calculadora.soma(0,0)!= 0){
            temErro = true;
        }

        if(temErro){
            System.out.println("\n\n## Houve um erro na validação da soma ##\n\n");
        }

        return temErro;

    }

    private static boolean subtracaoEstaOK(Calculadora calculadora){
        if(calculadora.subtracao(2,2)!=0){
            return false;
        }
        if(calculadora.subtracao(2,-2)!= 4){
            return false;
        }
        if(calculadora.subtracao(-2,-2)!= -0){
            return false;
        }
        if(calculadora.subtracao(0,0)!= 0){
            return false;
        }
        return true;
    }
}
