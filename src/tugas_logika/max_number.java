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
import java.util.Scanner;

public class max_number {
    public static void main(String[] arga){
        int maks = 0;
        int angka1;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan pertama : ");
        angka1 = input.nextInt();
        
        int angka2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan kedua : ");
        angka2 = scan.nextInt();
        
         if (angka1>angka2 ) {
            maks = angka1;
        } else if (angka2>angka1){
            maks = angka2;
        } 
                 System.out.println("Angka maksimum adalah= " +maks);

    }
}
