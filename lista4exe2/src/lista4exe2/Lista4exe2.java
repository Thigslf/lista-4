/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista4exe2;
import java.util.Scanner;
public class Lista4exe2 {
    public static void main(String[] args) {
     Scanner ler = new Scanner (System.in);        
        System.out.println("Digite o valor da altura do retangulo: ");
        int x = ler.nextInt();        
        System.out.println("Digite o valor da base do retangulo: ");
        int y = ler.nextInt();        
        System.out.println("A area do retangulo e: " + x * y);
    }

}
