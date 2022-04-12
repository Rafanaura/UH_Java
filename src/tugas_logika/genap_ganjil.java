/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_logika;

import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class genap_ganjil {
      public static void main(String[] args) {
          int angka;
          Scanner input = new Scanner(System.in);
          System.out.println("Mssukkan angka : ");
          angka = input.nextInt();
          
         if(angka % 2 == 0 ){
             System.out.println("genap");
          } else {
              System.out.println("ganjil");
          } 
      }
}
