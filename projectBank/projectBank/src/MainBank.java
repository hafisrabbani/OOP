
import java.util.Arrays;
import projectBankPrivate.Bank;
import projectBankPrivate.Nasabah;
import projectBankPrivate.Tabungan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nitro
 */
public class MainBank {
    
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        //invokes the getInstance() method and prints the corresponding result  
        System.out.println(bank.equals(bank2));
//        Bank bank = new Bank();
        Tabungan t = new Tabungan(500);
        bank.tambahNasabah("syahrul ramadhan", t);
        
        Tabungan t2 = new Tabungan(1000);
        bank.tambahNasabah(new Nasabah("syahrul natalan", t2));
        
        Tabungan t3 = new Tabungan(700);
        bank.tambahNasabah(new Nasabah("gede", t3));
        
        System.out.println(bank);
        
        System.out.println(bank.getNasabah(1));
        
        Nasabah hasil[] = bank.searchNasabah("syahrul");
        
        System.out.println(Arrays.toString(hasil));
        System.out.println(bank2);

    }
}
