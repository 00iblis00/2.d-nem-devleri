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
public class selectionSort {

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
            for (int j = i+1; j < i; j++) {
                if (array[j]<array[i]) {
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;                    
                }
 
                
                  
                
                
            }

        }
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i]+"-");
            
        }
        long elapsedTimeMillis = System.currentTimeMillis()-start;
        System.out.println(elapsedTimeMillis);
        
        
        
        
        
        
        
        
       
    }
    
}
