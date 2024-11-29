package exercicios;

public class Exercicio06 {
	public static boolean EhPar(int num) {
        return num % 2 == 0;  
    }

    public static void main(String[] args) {
        
        boolean resultado = EhPar(10);
        
        
        System.out.println("O número é par? " + resultado);
    }
}
