/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donem2;
import java.util.Random;
/**
 *
 * @author oyunt
 */
public class Insert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] array=new int[1000];    
        Random rnd=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rnd.nextInt(1000);
        }
        for (int i = 0; i < array.length; i++) {
            int var = array[i];
           int j=i-1;
           while   (j>-1 && array[j]>var)
            {
                    
                    array[j+1]=array[j];
                    j--;                 
                

            }
               array[j+1]=var;
        }
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i]+"-");
            
        }
        long elapsedTimeMillis = System.currentTimeMillis()-start;
        System.out.println(elapsedTimeMillis);
        
        
        
        
        
        
        
        
       
    }
    
}