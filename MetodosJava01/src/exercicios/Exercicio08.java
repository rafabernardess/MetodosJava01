package exercicios;

public class Exercicio08 {
	public static int CalcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;  
        }
        return fatorial;
    }

    public static void main(String[] args) {
        
        int resultado = CalcularFatorial(5);
        
       
        System.out.println("O fatorial de 5 é: " + resultado);
    }
}
