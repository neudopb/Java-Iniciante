/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pernasswitch;

import java.util.Scanner;

/**
 *
 * @author Neudinho Paulino
 */
public class PernasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas pernas? ");
        int pernas = input.nextInt();
        System.out.print("Isso é um(a) ");
        String tipo;
        
        switch(pernas){
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bípede";
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrúpide";
            break;
        case 6: case 8:
            tipo = "Aranha";
            break;
        default:
            tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
