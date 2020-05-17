/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Neudinho Paulino
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 2, 8, 7, 5, 4}; // int[] n = new int[6]

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        
        System.out.println("");
        Arrays.sort(n); //ORDENAÇÃO
        
        for(int valor: n){ //FOREACH
            System.out.print(valor + " ");
        }
        
        System.out.println("");
        int pos = Arrays.binarySearch(n, 7); //POSIÇÃO
        System.out.println("Valor: 7 na Posição: " + pos);
        
        int vet[] = new int[5];
        Arrays.fill(vet, 11);
        for(int v: vet){
            System.out.print(v + " ");
        }
        
        System.out.println("\n\n");

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
            "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int ano = 2020;
        if((ano%4 == 0 && (ano%100 != 0)) || (ano%400 == 0)){
            tot[1] = 29;
        }
        System.out.println("Ano: " + ano);

        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + " tem " + tot[i] + " dias.");
        }

    }

}
