/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class retangulo {
    int x;
    int y;
    int area;
    public retangulo (int x, int y, int area){
        this.x = x;
        this.y = y;
        this.area = area;
    }
    public void getx(int nx){
        x = nx;
    }
    public int setx(){
        return x;
    }
    public void gety(int ny){
        y = ny;
    }
    public int sety(){
        return y;
    }
    public void getarea(int arean){
        area = arean;
        
    }
    public int setarea(){
        return area;
    }
}


