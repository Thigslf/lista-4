/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Consumo {
    int gasolina1;
    int gasolina2;
    int gasolina3;
    float consumo1;
    float consumo2;
    float consumo3;
    float consumototal;
    int total1;
    int total2;
    int total3;    
    public Consumo (int gasolina1, int gasolina2, int gasolina3, float consumo1, float consumo2, float consumo3, float consumototal){   
    }    
        public void getgasolina1 (int gas1){
            gasolina1 = gas1;
        }
        public int setgasolina1(){
            return gasolina1;    
        }
        
        public void getgasolina2 (int gas2){
            gasolina2 = gas2; 
        }
        public int setgasolina2(){
            return gasolina2;
        }
        
        public void getgasolina3 (int gas3){
            gasolina3 = gas3;
        }
        public int setgasolina3(){
            return gasolina3;
        }
        
        public void getconsumo1(float cons1){
            consumo1 = cons1;               
        }
        public float setconsumo1(){
            return consumo1;           
        }
        
        public void getconsumo2(float cons2){
            consumo2 = cons2;
        }
        public float setconsumo2(){
            return consumo2;
        }
        
        public void getconsumo3(float cons3){
            consumo3 = cons3;
        }
        public float setconsumo3(){
            return consumo3;
        }
        
        public void getconsumototal(float constotal){
            consumototal = constotal;          
        }
        public float setconsumototal(){
            return consumototal;
        }
}
