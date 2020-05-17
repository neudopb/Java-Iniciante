package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Nota: ");
        float nota = input.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
    }
    
}
