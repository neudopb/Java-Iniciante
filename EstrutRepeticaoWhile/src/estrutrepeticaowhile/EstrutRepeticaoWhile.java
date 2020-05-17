/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutrepeticaowhile;

/**
 *
 * @author Neudinho Paulino
 */
public class EstrutRepeticaoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        
        while(cc < 4){
            System.out.println("Cambalhota " + cc);
            cc++;
        }
        
        System.out.println("\n\n");
        cc = 0;
        while(cc < 10){
            cc++;
            if(cc == 5 || cc == 7){
                continue; //interrompe o laço e volta pra condição
            }
            System.out.println("Cambalhota " + cc);
        }
        
        System.out.println("\n\n");
        cc = 0;
        while(cc < 10){
            cc++;
            if(cc == 6){
                break; //interrompe o laço e sai do while
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
