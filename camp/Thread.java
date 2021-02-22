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
public class Thread {
 public String suono;
    public int volte;
    Thread(Runnable s1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Thread(String suono, int volte){
    this.suono=suono;
    this.volte=volte;
    }
     public void run(){
    for(int i=0;i<volte;i++){
    System.out.print((i+1)+suono+" ");
    Thread.sleep(1000);
    }
    }
}
