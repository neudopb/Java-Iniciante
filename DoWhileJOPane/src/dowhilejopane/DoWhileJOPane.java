/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilejopane;

import javax.swing.JOptionPane;

/**
 *
 * @author Neudinho Paulino
 */
public class DoWhileJOPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola Mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);

        int n, tt = 0, par = 0, impar = 0, cem = 0;
        float media = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero: <br><em>0 interrompe</em></html>"));
            if (n != 0) {
                tt++;
                media += n;

                if (n % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

                if (n >= 100) {
                    cem++;
                }
            }
        } while (n != 0);

        media = (float) media / tt;

        JOptionPane.showMessageDialog(null, "<html>Resultado<hr>"
                + "Total de Valores: " + tt
                + "<br>Total de Pares: " + par
                + "<br>Total de Impares: " + impar
                + "<br>Acima de 100: " + cem
                + "<br>Media dos valores: " + media
                + "</html>");
    }

}
