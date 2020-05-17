/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author Neudinho Paulino
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String val = "40";
        int idd = Integer.parseInt(val);
        System.out.println(idd);
        
        String v = "10.5";
        float n = Float.parseFloat(v);
        System.out.println(n);
    }
    
}
