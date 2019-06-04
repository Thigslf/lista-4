/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista4exe3;
import java.util.Scanner;
public class Lista4exe3 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a gasolina gasta no primeiro abastecimento:");
    int gasolina1 = ler.nextInt();        
    System.out.println("Digite a quilometragem no primeiro teste:");
    float consumo1 = ler.nextFloat();        
    System.out.println("Digite a gasolina gasta no segundo abastecimento:");
    int gasolina2 = ler.nextInt();        
    System.out.println("Digite a quilometragem no segundo teste:");
    float consumo2 = ler.nextFloat();        
    System.out.println("Digite a gasolina gasta no terceiro abastecimento:");
    int gasolina3 = ler.nextInt();        
    System.out.println("Digite a quilometragem no terceiro teste:");
    float consumo3 = ler.nextFloat();        
    System.out.println("A media do primeiro consumo e:" + gasolina1/ consumo1);
    int total1 = (int) (gasolina1 / consumo1);        
    System.out.println("A media do segundo consumo e:" + gasolina2/ consumo2);
    int total2 = (int) (gasolina2 / consumo2);        
    System.out.println("A media do terceiro consumo e:" + gasolina3/ consumo3);
    int total3 = (int) (gasolina3 / consumo3);  
     
    System.out.println("O consumo total do teste e:" + total1 + total2 + total3);
    }

}
