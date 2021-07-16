/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogithub;

import java.util.Scanner;

/**
 *
 * @author Felipe Martinez
 */
public class Ejemplogithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
     int a;
     System.out.println("Ingrese un numero");
     a=teclado.nextInt();
     if(a>0)
       System.out.println("es positivo");
     else
     System.out.println("es negativo");
    }
    
}
