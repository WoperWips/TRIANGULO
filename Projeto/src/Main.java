package Projeto.src;

import Projeto.src.lib.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();
        
        // Testando o método soma
        int resultadoSoma = funcoes.soma(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // Testando o método triangulo
        System.out.println("Triângulo com altura: 5");
        funcoes.triangulo(5);
    }
}
