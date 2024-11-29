package exercicios;

public class Exercicio10 {
	 public static double CalcularMedia(double num1, double num2, double num3) {
	        return (num1 + num2 + num3) / 3;  
	    }

	    public static void main(String[] args) {
	        double media = CalcularMedia(8, 7, 9);
	        
	        System.out.println("A média é: " + media);
	    }
	}

