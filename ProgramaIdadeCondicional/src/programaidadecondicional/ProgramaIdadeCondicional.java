/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidadecondicional;

import java.util.Scanner;

/**
 *
 * @author Neudinho Paulino
 */
public class ProgramaIdadeCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ano de Nascimento: ");
        int ano = input.nextInt();
        int idade = 2020 - ano;
        System.out.println("Sua idade é " + idade);
        
        if(idade > 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
