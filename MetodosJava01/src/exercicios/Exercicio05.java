package exercicios;

public class Exercicio05 {
	public static int MaiorNumero(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
       
        int maior = MaiorNumero(10, 20);
        
      
        System.out.println("O maior número é: " + maior);
    }
}
