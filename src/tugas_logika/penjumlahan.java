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
public class penjumlahan {
        public static void main(String[] arga){
            int angka;
            int total = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan angka : ");
            angka = input.nextInt();
            
            for(int i = 1; i <= angka;i++){
                total += i;
                System.out.print(i+"+");
            }
            System.out.print("=" + total);
        }
}
