/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectBankPrivate;


/**
 *
 * @author Nitro
 */
public class Tabungan {
    
    public int saldo; 
    public static int bunga;  
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    @Override
    public String toString() {
        return "Tabungan{" + "saldo=" + saldo + '}';
    }
    
    public boolean getMoney(int jumlah) {
        
        if ((saldo - jumlah) > 0) {
            saldo = saldo - jumlah;
            return true;
        } else {
            System.out.println("Saldo Anda Tidak Mencukupi");
            return false;
        }
        
    }
    
    public void depositMoney(int jumlah) {
        saldo = saldo + jumlah;
    }
    
    public boolean transferMoney(Tabungan tab2, int jumlah) {
        
        if (saldo - jumlah > 0) {
//            saldo = saldo - jumlah;
            getMoney(jumlah);
//            tab2.saldo = tab2.saldo + jumlah;
            tab2.depositMoney(jumlah);
            return true;
        } else {
            return false;
        }
        
    }
}
