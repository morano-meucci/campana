/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camp;

/**
 *
 * @author 39334
 */
public class Campana implements Runnable{
    public String suono;
    public int volte;
    
    public Campana(String suono, int volte){
    this.suono=suono;
    this.volte=volte;
    }
    public void run(){
    for(int i=0;i<volte;i++){
    System.out.print((i+1)+suono+" ");
    }
    }
}
