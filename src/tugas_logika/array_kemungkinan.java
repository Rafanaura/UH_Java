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
public class array_kemungkinan {
        static boolean cari(int bilangan[],int ukuran, int K){
        for(int i = 0; i < (ukuran - 1); i++){
            for(int j = (i + 1); j < ukuran; j++ ){
                if(bilangan[i] + bilangan[j] == K){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] bilangan = {4, 1, 8, 7, 4};
        int ukuran = bilangan.length;
        int K = 10;
        
        if(cari(bilangan, ukuran, K)){
            System.out.println("BISA");
        }else{
            System.out.println("TIDAK BISA");
        }
    }
              }
              

