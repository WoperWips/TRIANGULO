package Projeto.src.lib;

public class FuncoesUteis {
    
    // Método que realiza a soma de dois números inteiros
    public int soma(int a, int b) {
        return a + b;
    }
    
    // Método que imprime um triângulo de 'x' com a altura especificada
    public void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();  // Quebra de linha
        }
    }
}
