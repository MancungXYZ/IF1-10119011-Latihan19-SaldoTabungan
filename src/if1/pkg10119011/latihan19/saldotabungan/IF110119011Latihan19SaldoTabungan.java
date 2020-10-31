/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan19.saldotabungan;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bulan = 6;
        int saldo = 2500000;
        int i = 1;
        double bunga = 0.15;
        double saldobulanan;
        
        while (i <= bulan) {
            saldobulanan = saldo * bunga;
            saldo = (int) (saldo + saldobulanan);
                System.out.println("Saldo di bulan ke-" + i + " Rp :" + (int) saldo);
                i++;
        }
    
    }
    
}
