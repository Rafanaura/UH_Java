/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_logika;
//import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class ganjil_genap_array {
          public static void main(String[] args) {
              int []angka = {4,6,1,3,5};
              
              
              for(int i=0; i<5; i++){
                  if(angka[i] % 2 == 0){
                      System.out.print("genap,");
                  } else {
                      System.out.print("ganjil,");
                  }
              }
//              
          }
}
