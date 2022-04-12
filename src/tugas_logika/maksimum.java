/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_logika;

/**
 *
 * @author MOKLET-2
 */
public class maksimum {
          public static void main(String[] args) {
              
            int[]angka = {4,6,1,3,5};
            int maksimum = angka[0];
                for(int i = 0; i < angka.length; i++) {
                    if(angka[i]>maksimum){
                        maksimum = angka[i];
    } 
                   
               
            }
             System.out.println("angka maks : "+ maksimum);

            
            
          }
}
