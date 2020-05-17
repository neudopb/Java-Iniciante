/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutrepeticaodowhile;

import java.util.Scanner;

/**
 *
 * @author Neudinho Paulino
 */
public class EstrutRepeticaoDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        do {
            System.out.println("Cambalhota " + cc);
            cc++;
        } while (cc < 4);
        
        System.out.println("\n\n");
        
        Scanner input = new Scanner(System.in);
        int n, s = 0;
        String resp;
        
        do{
            System.out.print("Digite um valor: ");
            n = input.nextInt();
            s += n;
            System.out.print("Continuar [S/N]? ");
            resp = input.next();
        } while(resp.equals("S"));
        
        System.out.println("A soma dos valores é " + s);
    }

}
