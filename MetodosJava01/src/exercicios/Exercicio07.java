package exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio07 {

   
    public static String ObterDataAtual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        return sdf.format(data);
    }

    public static void main(String[] args) {
       
        String dataAtual = ObterDataAtual();
        
      
        System.out.println("Data atual: " + dataAtual);
    }
}

