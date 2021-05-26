package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author Arthur Cardoso de Jesus
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nomeCliente;
        double compras, bonus;
        for (int cont = 1; cont <= 150; cont++) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Insira o nome do cliente:");
            
            nomeCliente = ler.nextLine();
            System.out.println("--------------------------");
            System.out.println("Insira o valor das compras:");
            compras = ler.nextDouble();
            if (compras < 500) {
                bonus = compras * 0.10;
            } else {
                bonus = compras * 0.15;
            }
           System.out.println("O bonus de " + nomeCliente + " é de:R$" + bonus
                    + "\n------------------------------");
        }
    }

}
