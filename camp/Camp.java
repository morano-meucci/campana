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
public class Camp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable s1=new Campana("din",3);
        Runnable s2=new Campana("don",3);
        Runnable s3=new Campana("dan",3);
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);
        Thread t3=new Thread(s3);
        t1.run();
        t2.run();
        t3.run();
    }
    
}
