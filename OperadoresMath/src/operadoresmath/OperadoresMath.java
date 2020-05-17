/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresmath;

/**
 *
 * @author Neudinho Paulino
 */
public class OperadoresMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Class Math
        System.out.println("PI: " + Math.PI);
        System.out.println("Exponenciação: " + Math.pow(5, 2));
        System.out.println("Raiz Quadrada: " + Math.sqrt(25));
        System.out.println("Raiz Cubica: " + Math.cbrt(27));
        
        //Arredondamentos
        System.out.println("Valor Absoluto: " + Math.abs(10));
        System.out.println("Arredonda para baixo: " + Math.floor(3.9));
        System.out.println("Arredonda para cima: " + Math.ceil(3.2));
        System.out.println("Arredonda aritmenticamente: " + Math.round(5.6));
        
        //Gerador de Numeros
        double al = Math.random();
        System.out.println(al);
        
        int v = (int) (5 + al * (10 - 5)); //entre 5 e 10
        System.out.println(v);
    }
    
}
